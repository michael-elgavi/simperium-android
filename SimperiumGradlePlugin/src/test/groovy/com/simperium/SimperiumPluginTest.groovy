package com.simperium;

import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.assertTrue;

import org.gradle.api.Project;
import org.gradle.testfixtures.ProjectBuilder;

import com.android.build.gradle.api.ApplicationVariant

public class SimperiumPluginTest {

    @Test public void applyPlugin() {
        def testDir = new File('.')
        Project project = ProjectBuilder.builder().build()

        project.apply plugin:'android'
        project.apply plugin:'simperium'

        assertTrue(project.extensions.simperium instanceof SimperiumPluginExtension)

    }
    
}