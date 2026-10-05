package com.github.rudroid.views;

import android.view.View;
import android.widget.ImageView;
import android.widget.SearchView;

/* loaded from: /home/user/work/p/classes3.dex */
public final class v {
    public static final void a(SearchView searchView, j71.a aVar) {
        k71.k.g(searchView, "<this>");
        View findViewById = searchView.findViewById(searchView.getContext().getResources().getIdentifier("android:id/search_close_btn", null, null));
        ImageView imageView = findViewById instanceof ImageView ? (ImageView) findViewById : null;
        if (imageView != null) {
            imageView.setOnClickListener(new com.github.rudroid.actions.checklog.c(aVar));
        }
    }
}
