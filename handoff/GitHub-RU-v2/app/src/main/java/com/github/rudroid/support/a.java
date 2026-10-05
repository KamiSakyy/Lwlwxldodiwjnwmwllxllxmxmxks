package com.github.rudroid.support;

import ic.oe;

/* loaded from: /home/user/work/p/classes3.dex */
public final class a extends com.github.rudroid.adapters.viewholders.e<k5.f> {
    public final InterfaceC0007a v;

    /* renamed from: com.github.rudroid.support.a$a, reason: collision with other inner class name */
    public interface InterfaceC0007a {
        void e2();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(oe oeVar, SupportFragment supportFragment) {
        super(oeVar);
        k71.k.g(supportFragment, "callback");
        this.v = supportFragment;
        oeVar.N.setOnClickListener(new com.github.rudroid.actions.checklog.c(5, this));
    }

    // [restore] вложенный стаб: оригинал потерян при декомпиляции
    public static class oe<T1,T2,T3,T4> {
        public oe() {
        }
    }
}
