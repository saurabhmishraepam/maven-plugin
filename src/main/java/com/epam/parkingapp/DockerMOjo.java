package com.epam.parkingapp;

import org.apache.maven.plugin.AbstractMojo;
import org.apache.maven.plugin.MojoExecutionException;
import org.apache.maven.plugins.annotations.Mojo;

/**
 * Created by saurabh on 26/4/19.
 */
@Mojo(name="docker")
public class DockerMOjo extends AbstractMojo
{
    public void execute()
            throws MojoExecutionException
    {
        getLog().info("docker dun");
    }
}
