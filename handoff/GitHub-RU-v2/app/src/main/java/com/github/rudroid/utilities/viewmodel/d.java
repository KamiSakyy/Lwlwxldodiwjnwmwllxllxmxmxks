package com.github.rudroid.utilities.viewmodel;

import k71.k;
import w8.s;
import y71.h1;
import y71.m1;

/* loaded from: /home/user/work/p/classes3.dex */
public interface d {

    public static final class a implements d {
        public final m1 r;
        public final h1 s;

        public a() {
            m1 j = s.j();
            this.r = j;
            this.s = new h1(j);
        }

        public final void a(fl.b bVar) {
            k.g(bVar, "executionError");
            this.r.m(bVar);
        }
    }
}
