package info.touchimage.demo

import android.graphics.drawable.Drawable
import android.os.Bundle
import androidx.annotation.Nullable
import androidx.appcompat.app.AppCompatActivity
import com.bumptech.glide.Glide
import com.bumptech.glide.request.target.CustomTarget
import com.bumptech.glide.request.transition.Transition
import kotlinx.android.synthetic.main.activity_glide.*


class GlideExampleActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_glide)

        Glide.with(this)
                .load(GLIDE_IMAGE_URL)
                .into(object : CustomTarget<Drawable?>() {
                    override fun onResourceReady(resource: Drawable, transition: Transition<in Drawable?>?) {
                        imageGlide.setImageDrawable(resource)
                    }

                    override fun onLoadCleared(@Nullable placeholder: Drawable?) = Unit

                })
    }

    companion object {
        const val GLIDE_IMAGE_URL = "https://raw.githubusercontent.com/bumptech/glide/master/static/glide_logo.png"
    }
}
