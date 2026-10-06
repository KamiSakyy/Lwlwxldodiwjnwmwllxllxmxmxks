package com.google.android.gms.internal.measurement;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Callable;

/* loaded from: /home/user/work/p/classes4.dex */
public final class e0 {
    public final w51.r a;
    public w51.r b;
    public final a5.s c;
    public final t d;

    public e0() {
        w51.r rVar = new w51.r(5);
        this.a = rVar;
        this.b = ((w51.r) rVar.t).Z();
        this.c = new a5.s(9, (byte) 0);
        this.d = new t(3);
        final int i = 1;
        Callable callable = new Callable(this) { // from class: com.google.android.gms.internal.measurement.a
            public final /* synthetic */ e0 b;

            {
                this.b = this;
            }

            @Override // java.util.concurrent.Callable
            public final /* synthetic */ Object call() {
                switch (i) {
                    case 0:
                        return new j4(this.b.c);
                    default:
                        return new j4(this.b.d);
                }
            }
        };
        t5 t5Var = (t5) rVar.v;
        ((HashMap) t5Var.r).put("internal.registerCallback", callable);
        final int i2 = 0;
        ((HashMap) t5Var.r).put("internal.eventLogger", new Callable(this) { // from class: com.google.android.gms.internal.measurement.a
            public final /* synthetic */ e0 b;

            {
                this.b = this;
            }

            @Override // java.util.concurrent.Callable
            public final /* synthetic */ Object call() {
                switch (i2) {
                    case 0:
                        return new j4(this.b.c);
                    default:
                        return new j4(this.b.d);
                }
            }
        });
    }

    public final boolean a(b bVar) {
        a5.s sVar = this.c;
        try {
            sVar.t = bVar;
            sVar.u = bVar.clone();
            ((ArrayList) sVar.s).clear();
            ((w51.r) this.a.u).b0("runtime.counter", new g(Double.valueOf(0.0d)));
            this.d.d(this.b.Z(), sVar);
            if (((b) sVar.u).equals((b) sVar.t)) {
                return !((ArrayList) sVar.s).isEmpty();
            }
            return true;
        } catch (Throwable th) {
            throw new zzd(th);
        }
    }

    public final void b(v3 v3Var) {
        h hVar;
        try {
            w51.r rVar = this.a;
            this.b = ((w51.r) rVar.t).Z();
            if (rVar.W(this.b, (w3[]) v3Var.p().toArray(new w3[0])) instanceof f) {
                throw new IllegalStateException("Program loading failed");
            }
            for (u3 u3Var : v3Var.q().p()) {
                List q = u3Var.q();
                String p = u3Var.p();
                Iterator it = q.iterator();
                while (it.hasNext()) {
                    n W = rVar.W(this.b, (w3) it.next());
                    if (!(W instanceof k)) {
                        throw new IllegalArgumentException("Invalid rule definition");
                    }
                    w51.r rVar2 = this.b;
                    if (rVar2.a0(p)) {
                        n d0 = rVar2.d0(p);
                        if (!(d0 instanceof h)) {
                            throw new IllegalStateException("Invalid function name: ".concat(String.valueOf(p)));
                        }
                        hVar = (h) d0;
                    } else {
                        hVar = null;
                    }
                    if (hVar == null) {
                        throw new IllegalStateException("Rule function is undefined: ".concat(String.valueOf(p)));
                    }
                    hVar.c(this.b, Collections.singletonList(W));
                }
            }
        } catch (Throwable th) {
            throw new zzd(th);
        }
    }
}
