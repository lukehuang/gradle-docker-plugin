package org.gradle.api.plugins.docker.tasks.image

import org.gradle.api.Task
import org.gradle.api.plugins.docker.tasks.DockerTaskIntegrationTest

class DockerCommitImageIntegrationTest extends DockerTaskIntegrationTest {
    @Override
    Task createAndConfigureTask() {
        project.task('commitImage', type: DockerCommitImage) {
            containerId = 'busybox'
        }
    }
}
