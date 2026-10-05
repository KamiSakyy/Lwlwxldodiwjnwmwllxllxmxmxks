package com.github.rudroid.views;

import android.content.Context;
import android.view.ViewGroup;
import androidx.appcompat.widget.SearchView;

/* loaded from: /home/user/work/p/classes3.dex */
public final class FullWidthSearchView extends SearchView {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FullWidthSearchView(Context context) {
        super(context, (Object) null);
        k71.k.g(context, "context");
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void setLayoutParams(ViewGroup.LayoutParams layoutParams) {
        k71.k.g(layoutParams, "params");
        layoutParams.width = -1;
        super/*android.view.View*/.setLayoutParams(layoutParams);
    }
}
