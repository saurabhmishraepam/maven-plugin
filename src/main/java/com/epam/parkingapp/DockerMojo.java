package com.epam.parkingapp;

import org.apache.maven.plugin.AbstractMojo;
import org.apache.maven.plugin.MojoExecutionException;
import org.apache.maven.plugins.annotations.LifecyclePhase;
import org.apache.maven.plugins.annotations.Mojo;
import org.apache.maven.plugins.annotations.Parameter;

import java.net.URL;
/**
 * Created by saurabh on 26/4/19.
 */
@Mojo(name="dockerbuild", defaultPhase = LifecyclePhase.PACKAGE)
public class DockerMojo extends AbstractMojo
{



    @Parameter
    private URL dockerRepoURL;
    public void execute()
            throws MojoExecutionException
    {
        getLog().info("docker dun"+dockerRepoURL);
    }
}
