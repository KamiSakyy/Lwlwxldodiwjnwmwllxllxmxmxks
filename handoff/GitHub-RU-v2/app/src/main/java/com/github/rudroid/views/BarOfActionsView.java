package com.github.rudroid.views;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.LinearLayout;

/* loaded from: /home/user/work/p/classes3.dex */
public final class BarOfActionsView extends LinearLayout {
    public a r;

    public interface a {
        public static final C0018a Companion = C0018a.a;

        /* renamed from: com.github.rudroid.views.BarOfActionsView$a$a, reason: collision with other inner class name */
        public static final class C0018a {
            public static final /* synthetic */ C0018a a = new C0018a();
            public static final C0019a b = new C0019a();

            /* renamed from: com.github.rudroid.views.BarOfActionsView$a$a$a, reason: collision with other inner class name */
            public static final class C0019a implements a {
                @Override // com.github.rudroid.views.BarOfActionsView.a
                public final void a() {
                }
            }
        }

        void a();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BarOfActionsView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0, 0);
        k71.k.g(context, "context");
        a.Companion.getClass();
        this.r = a.C0018a.b;
    }

    public final a getActionListener() {
        return this.r;
    }

    @Override // android.view.ViewGroup
    public final void onViewAdded(View view) {
        k71.k.g(view, "child");
        super.onViewAdded(view);
        view.setOnClickListener(new cd.n(14, this, view));
    }

    public final void setActionListener(a aVar) {
        k71.k.g(aVar, "<set-?>");
        this.r = aVar;
    }
}
