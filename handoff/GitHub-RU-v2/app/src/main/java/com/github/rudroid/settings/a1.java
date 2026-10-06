package com.github.rudroid.settings;

import java.util.List;
import kotlin.NoWhenBranchMatchedException;

/* loaded from: /home/user/work/p/classes3.dex */
public interface a1 {

    public static abstract class a {
        public pm.c a;

        /* renamed from: com.github.rudroid.settings.a1$a$a, reason: collision with other inner class name */
        public static final class C0005a extends a {
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C0005a(pm.c cVar) {
                super(cVar);
                k71.k.g(cVar, "schedulesData");
            }
        }

        public static final class b extends a {
        }

        public static final class c extends a {
            public static final c b;
        }

        public a(pm.c cVar) {
            this.a = cVar;
        }

        public final a a(j71.c cVar) {
            if (this instanceof C0005a) {
                return new C0005a((pm.c) cVar.k(this.a));
            }
            if (this instanceof b) {
                pm.c cVar2 = (pm.c) cVar.k(this.a);
                k71.k.g(cVar2, "schedulesData");
                return new b(cVar2);
            }
            if (this instanceof c) {
                return c.b;
            }
            throw new NoWhenBranchMatchedException();
        }
    }

    void B();

    void C(int i, int i2);

    void G(List list);

    void I(boolean z);

    void d();

    void h(int i, int i2);

    void o();

    y71.y1 p();
}
