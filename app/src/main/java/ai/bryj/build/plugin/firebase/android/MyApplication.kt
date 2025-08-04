package ai.bryj.build.plugin.firebase.android

import ai.bryj.Grow
import ai.bryj.build.plugin.android.BuildConfig
import android.webkit.WebView
import com.follow.mobile.framework.FollowAnalyticsApplication
import timber.log.Timber

class MyApplication: FollowAnalyticsApplication() {

    override fun onCreate() {
        super.onCreate()
        WebView.setWebContentsDebuggingEnabled(BuildConfig.DEBUG)
    }

    override fun setupAnalytics() {
        Timber.plant(Timber.DebugTree())
        Grow.start(
            applicationContext,
            Grow.ConfigurationBuilder(apiKey = "m6h5gYN2S3NAytIYutPoMvQQfXM")
                .setIsVerboseEnabled(true)
                .setAnalyticsEnabledByDefault(true)
                .build()
        )
    }
}