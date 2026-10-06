package rh;

import a0.s0;
import com.github.rudroid.copilot.h1;
import com.github.rudroid.m0;
import jo.f4;

/* loaded from: /home/user/work/p/classes3.dex */
public final class c extends f {

    public static final class a implements c {
        public fl.b a;
        public String b;
        public boolean c;
        public boolean d;

        public a(fl.b bVar, String str, boolean z, boolean z2) {
            k71.k.g(bVar, "executionError");
            k71.k.g(str, "message");
            this.a = bVar;
            this.b = str;
            this.c = z;
            this.d = z2;
        }

        @Override // rh.f
        public final fl.b a() {
            return this.a;
        }

        @Override // rh.c
        public final boolean b() {
            return this.d;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return k71.k.b(this.a, aVar.a) && k71.k.b(this.b, aVar.b) && this.c == aVar.c && this.d == aVar.d;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.d) + x.i.e(h1.i(this.a.hashCode() * 31, this.b, 31), 31, this.c);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("GenericError(executionError=");
            sb.append(this.a);
            sb.append(", message=");
            sb.append(this.b);
            sb.append(", showTryAgain=");
            return m0.m(sb, this.c, ", dataIsEmpty=", this.d, ")");
        }
    }

    public static final class b implements c {
        public fl.b a;
        public int b;
        public boolean c;
        public boolean d;

        public b(fl.b bVar, int i, boolean z, boolean z2) {
            k71.k.g(bVar, "executionError");
            this.a = bVar;
            this.b = i;
            this.c = z;
            this.d = z2;
        }

        @Override // rh.f
        public final fl.b a() {
            return this.a;
        }

        @Override // rh.c
        public final boolean b() {
            return this.d;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return k71.k.b(this.a, bVar.a) && this.b == bVar.b && this.c == bVar.c && this.d == bVar.d;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.d) + x.i.e(s0.b(this.b, this.a.hashCode() * 31, 31), 31, this.c);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("GenericSystemError(executionError=");
            sb.append(this.a);
            sb.append(", message=");
            sb.append(this.b);
            sb.append(", showTryAgain=");
            return m0.m(sb, this.c, ", dataIsEmpty=", this.d, ")");
        }
    }

    /* renamed from: rh.c$c, reason: collision with other inner class name */
    public static final class C0030c implements c {
        public fl.b a;
        public boolean b;
        public boolean c;

        public C0030c(fl.b bVar, boolean z) {
            k71.k.g(bVar, "executionError");
            this.a = bVar;
            this.b = z;
            this.c = z;
        }

        @Override // rh.f
        public final fl.b a() {
            return this.a;
        }

        @Override // rh.c
        public final boolean b() {
            return this.b;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C0030c)) {
                return false;
            }
            C0030c c0030c = (C0030c) obj;
            return k71.k.b(this.a, c0030c.a) && this.b == c0030c.b && this.c == c0030c.c;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.c) + x.i.e(s0.b(2131952518, this.a.hashCode() * 31, 31), 31, this.b);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("NoNetworkError(executionError=");
            sb.append(this.a);
            sb.append(", message=2131952518, dataIsEmpty=");
            sb.append(this.b);
            sb.append(", showTryAgain=");
            return f4.s(sb, this.c, ")");
        }
    }

    public static final class d implements c {
        public fl.b a;
        public boolean b;
        public boolean c;

        public d(fl.b bVar, boolean z, boolean z2) {
            k71.k.g(bVar, "executionError");
            this.a = bVar;
            this.b = z;
            this.c = z2;
        }

        @Override // rh.f
        public final fl.b a() {
            return this.a;
        }

        @Override // rh.c
        public final boolean b() {
            return this.c;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof d)) {
                return false;
            }
            d dVar = (d) obj;
            return k71.k.b(this.a, dVar.a) && this.b == dVar.b && this.c == dVar.c;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.c) + x.i.e(s0.b(2131952512, this.a.hashCode() * 31, 31), 31, this.b);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("ServerError(executionError=");
            sb.append(this.a);
            sb.append(", message=2131952512, showTryAgain=");
            sb.append(this.b);
            sb.append(", dataIsEmpty=");
            return f4.s(sb, this.c, ")");
        }
    }

    boolean b() { return false; }

    public c() {
    }

    public c(Object p1) {
    }

    public c(Object p1, Object p2) {
    }

    public c(Object p1, Object p2, Object p3) {
    }

    public c(Object p1, Object p2, Object p3, Object p4) {
    }

    public c(Object p1, Object p2, Object p3, Object p4, Object p5, Object p6) {
    }

    public c(Object p1, Object p2, Object p3, Object p4, Object p5, Object p6, Object p7, Object p8, Object p9, Object p10, Object p11, Object p12, Object p13, Object p14) {
    }
}
