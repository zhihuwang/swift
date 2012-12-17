/**
 * Copyright 2013 Facebook, Inc.
 *
 * Licensed under the Apache License, Version 2.0 (the "License"); you may
 * not use this file except in compliance with the License. You may obtain
 * a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS, WITHOUT
 * WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the
 * License for the specific language governing permissions and limitations
 * under the License.
 */
package com.facebook.swift.generator;

import com.beust.jcommander.Parameter;

import java.io.File;
import java.net.URI;
import java.util.List;

public class SwiftGeneratorCommandLineConfig
{
    @Parameter(description = "Thrift IDL input files")
    public List<File> inputFiles;

    @Parameter(names = "-out", description = "Output directory")
    public File outputDirectory = new File(System.getProperty("user.dir") + "/gen-swift");

    @Parameter(
            names = "-override_package",
            description = "Force generation of code in a specific package"
    )
    public String overridePackage = null;

    @Parameter(
            names = "-default_package",
            description = "Use this package if there is no package specified in the IDL for java"
    )
    public String defaultPackage = null;

    @Parameter(
            names = "-add_thrift_exceptions",
            description = "Add TException as a return type for generated interfaces"
    )
    public boolean addThriftExceptions = false;

    @Parameter(
            names = "-generate_included_files",
            description = "Generate code for included IDL files as well as specified IDL files"
    )
    public boolean generateIncludedCode = false;

    @Parameter(
            names = "-generate_mutable_structs",
            description = "Generate mutable structs for thrift types"
    )
    public boolean mutableTypes = false;
}