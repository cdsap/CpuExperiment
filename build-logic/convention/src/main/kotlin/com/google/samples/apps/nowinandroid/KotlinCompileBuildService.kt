package com.google.samples.apps.nowinandroid


import com.android.build.gradle.internal.services.ServiceRegistrationAction
import org.gradle.api.Project
import org.gradle.api.services.BuildService
import org.gradle.api.services.BuildServiceParameters
import org.gradle.api.services.BuildServiceParameters.None

abstract class KotlinCompileBuildService: BuildService<BuildServiceParameters.None> {
    class RegistrationAction(project: Project, maxParallelUsages: Int?) :
        ServiceRegistrationAction<KotlinCompileBuildService, None>(
            project,
            KotlinCompileBuildService::class.java,
            maxParallelUsages ?: DEFAULT_INSTANCE_POOL_SIZE
        ) {
        override fun configure(parameters: BuildServiceParameters.None) {
            // do nothing
        }
    }
}

private const val DEFAULT_INSTANCE_POOL_SIZE = 1
