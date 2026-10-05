package com.github.rudroid.actions.checklog;

import android.view.View;
import android.widget.TextView;
import com.github.rudroid.adapters.viewholders.o3;
import ic.qc;

/* loaded from: /home/user/work/p/classes.dex */
public final class w0 extends com.github.rudroid.adapters.viewholders.e<k5.f> implements o3 {

    /* renamed from: v, reason: collision with root package name */
    public final com.github.rudroid.interfaces.e f4896v;

    public w0(qc qcVar, CheckLogFragment checkLogFragment) {
        super(qcVar);
        this.f4896v = checkLogFragment;
    }

    @Override // com.github.rudroid.adapters.viewholders.o3
    public final View c() {
        k5.f fVar = this.f6016u;
        k71.k.e(fVar, "null cannot be cast to non-null type com.github.rudroid.databinding.ListItemNumberedLineBinding");
        TextView textView = ((qc) fVar).P;
        k71.k.f(textView, "lineNumber");
        return textView;
    }

    @Override // com.github.rudroid.adapters.viewholders.o3
    public final void d(int i) {
    }









    // [restore] вложенный стаб: оригинал потерян при декомпиляции
    public static class CheckLogFragment<T1,T2,T3,T4> {
        public CheckLogFragment() {
        }
    }
}
