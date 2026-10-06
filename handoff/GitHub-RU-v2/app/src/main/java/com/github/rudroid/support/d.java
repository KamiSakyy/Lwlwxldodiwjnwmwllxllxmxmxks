package com.github.rudroid.support;

import android.net.Uri;
import ic.qe;

/* loaded from: /home/user/work/p/classes3.dex */
public final class d extends com.github.rudroid.adapters.viewholders.e<k5.f> {
    public a v;

    public interface a {
        void h0(Uri uri);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(qe qeVar, SupportFragment supportFragment) {
        super(qeVar);
        k71.k.g(supportFragment, "callback");
        this.v = supportFragment;
    }

    public Object a() { return null; }
    public Object b() { return null; }
    public Object B = null;
    public Object s = null;
    public Object t = null;
    public Object u = null;
}
