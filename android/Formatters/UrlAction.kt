package ___PACKAGE___

import android.content.Intent
import android.net.Uri
import android.widget.TextView
import androidx.databinding.BindingAdapter

@BindingAdapter("urlAction")
fun urlAction(view: TextView, urlAction: String?) {
    if (urlAction.isNullOrEmpty()) return

    view.setOnClickListener {
        val urlIntent = Intent(Intent.ACTION_VIEW, Uri.parse(urlAction))
        view.context.startActivity(Intent.createChooser(urlIntent, "Url"))
    }
}
