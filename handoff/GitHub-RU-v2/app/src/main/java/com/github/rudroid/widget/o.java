package com.github.rudroid.widget;

import androidx.compose.runtime.s;
import z70.m2;

/* loaded from: /home/user/work/p/classes3.dex */
public final class o {
    public static final m6.e a(s sVar) {
        m6.b bVar;
        s3.o oVar;
        m6.c cVar;
        m2 m2Var;
        h6.a aVar = k.a;
        long j = ih.d.f(sVar).p.a.b;
        m2 m2Var2 = new m2(7);
        s3.o oVar2 = new s3.o(j);
        m6.b bVar2 = new m6.b(700);
        m6.c cVar2 = new m6.c(3);
        if ((40 & 2) != 0) {
            oVar2 = null;
        }
        if ((40 & 4) != 0) {
            bVar2 = null;
        }
        if ((40 & 16) != 0) {
            cVar2 = null;
        }
        if ((40 & 64) != 0) {
            m6.c cVar3 = cVar2;
            bVar = bVar2;
            oVar = oVar2;
            cVar = cVar3;
            m2Var = null;
        } else {
            m6.c cVar4 = cVar2;
            bVar = bVar2;
            oVar = oVar2;
            cVar = cVar4;
            m2Var = m2Var2;
        }
        return new m6.e(aVar, oVar, bVar, cVar, m2Var);
    }

    // [restore] вложенный стаб: оригинал потерян при декомпиляции
    public static class s<T1,T2,T3,T4> {
        public s() {
        }
    }
}
