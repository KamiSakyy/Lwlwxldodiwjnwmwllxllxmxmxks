package com.github.rudroid.views;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.HorizontalScrollView;
import android.widget.ImageButton;
import android.widget.LinearLayout;
import com.github.rudroid.interfaces.d0;
import ic.dh;
import q.j3;

/* loaded from: /home/user/work/p/classes3.dex */
public final class MarkdownBarView extends HorizontalScrollView {
    public final dh r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MarkdownBarView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0, 0);
        ImageButton imageButton;
        CharSequence contentDescription;
        k71.k.g(context, "context");
        int i = 0;
        dh b = k5.b.b(LayoutInflater.from(context), 2131559294, this, true, k5.b.b);
        k71.k.f(b, "inflate(...)");
        dh dhVar = b;
        this.r = dhVar;
        LinearLayout linearLayout = dhVar.O;
        k71.k.f(linearLayout, "markdownBarActions");
        while (i < linearLayout.getChildCount()) {
            int i2 = i + 1;
            View childAt = linearLayout.getChildAt(i);
            if (childAt == null) {
                throw new IndexOutOfBoundsException();
            }
            if ((childAt instanceof ImageButton) && (contentDescription = (imageButton = (ImageButton) childAt).getContentDescription()) != null && contentDescription.length() != 0) {
                j3.a(childAt, imageButton.getContentDescription());
            }
            i = i2;
        }
    }

    public final void setOnItemSelectedListener(d0 d0Var) {
        k71.k.g(d0Var, "listener");
        this.r.P0(d0Var);
    }


}
