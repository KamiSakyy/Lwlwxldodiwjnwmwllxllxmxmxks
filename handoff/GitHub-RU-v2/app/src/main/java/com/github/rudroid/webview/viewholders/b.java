package com.github.rudroid.webview.viewholders;

import android.view.View;
import android.widget.FrameLayout;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.github.rudroid.adapters.viewholders.o3;
import com.github.rudroid.utilities.b3;
import ic.ea;
import zh.c;

/* loaded from: /home/user/work/p/classes3.dex */
public final class b extends com.github.rudroid.adapters.viewholders.e<k5.f> implements o3 {
    public final int v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(ea eaVar) {
        super(eaVar);
        k71.k.g(eaVar, "binding");
        this.v = ((k5.f) eaVar).A.getResources().getDimensionPixelSize(2131165315);
    }

    public final View c() {
        View view = ((com.github.rudroid.adapters.viewholders.e) this).u.A;
        k71.k.f(view, "getRoot(...)");
        return view;
    }

    public final void d(int i) {
        ((com.github.rudroid.adapters.viewholders.e) this).u.A.getLayoutParams().width = i;
    }

    public final void y(c.b bVar) {
        k71.k.g(bVar, "item");
        ea eaVar = ((com.github.rudroid.adapters.viewholders.e) this).u;
        k71.k.e(eaVar, "null cannot be cast to non-null type com.github.rudroid.databinding.ListItemIssuePrCommentBodyBinding");
        ea eaVar2 = eaVar;
        TextView textView = eaVar2.N;
        textView.setText(2131952994);
        textView.setTextAppearance(2132017533);
        FrameLayout frameLayout = eaVar2.O;
        int dimensionPixelSize = textView.getResources().getDimensionPixelSize(2131166020);
        int i = this.v;
        frameLayout.setPadding(i, dimensionPixelSize, i, i);
        ConstraintLayout constraintLayout = eaVar2.P;
        k71.k.f(constraintLayout, "listItemIssuePrCommentBody");
        b3.c(constraintLayout, bVar.v ? 2131099708 : 2131099994);
    }

}
