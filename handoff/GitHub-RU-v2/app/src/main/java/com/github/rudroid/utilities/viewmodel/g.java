package com.github.rudroid.utilities.viewmodel;

import k71.k;
import y71.i1;
import y71.n1;
import y71.w1;
import y71.y1;

/* loaded from: /home/user/work/p/classes3.dex */
public interface g {

    public static final class a implements g {
        public y1 r;
        public i1 s;

        public a() {
            y1 c = n1.c((Object) null);
            this.r = c;
            this.s = new i1(c);
        }

        @Override // com.github.rudroid.utilities.viewmodel.g
        public final w1 J() {
            return this.s;
        }

        @Override // com.github.rudroid.utilities.viewmodel.g
        public final void c(fl.b bVar) {
            k.g(bVar, "executionError");
            y1 y1Var = this.r;
            if (k.b(y1Var.getValue(), bVar)) {
                y1Var.j((Object) null);
            }
        }
    }

    w1 J();

    void c(fl.b bVar);
}
