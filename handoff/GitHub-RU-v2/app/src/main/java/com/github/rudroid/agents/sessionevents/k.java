package com.github.rudroid.agents.sessionevents;

/* loaded from: /home/user/work/p/classes.dex */
public interface k {

    public static final class a implements k {

        /* renamed from: a, reason: collision with root package name */
        public final g f7676a;

        /* renamed from: b, reason: collision with root package name */
        public final boolean f7677b;

        /* renamed from: c, reason: collision with root package name */
        public final boolean f7678c;

        public a(g gVar, boolean z10, boolean z11) {
            this.f7676a = gVar;
            this.f7677b = z10;
            this.f7678c = z11;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return k71.k.b(this.f7676a, aVar.f7676a) && this.f7677b == aVar.f7677b && this.f7678c == aVar.f7678c;
        }

        public final int hashCode() {
            g gVar = this.f7676a;
            return Boolean.hashCode(this.f7678c) + x.i.e((gVar == null ? 0 : gVar.hashCode()) * 31, 31, this.f7677b);
        }

        public final String toString() {
            StringBuilder sb2 = new StringBuilder("Prompt(freeform=");
            sb2.append(this.f7676a);
            sb2.append(", canStop=");
            sb2.append(this.f7677b);
            sb2.append(", canInput=");
            return jo.f4.s(sb2, this.f7678c, ")");
        }
    }

    public static final class b implements k {

        /* renamed from: a, reason: collision with root package name */
        public static final b f7679a = new b();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof b);
        }

        public final int hashCode() {
            return -257641080;
        }

        public final String toString() {
            return "SendingUserInput";
        }
    }

    public static final class c implements k {

        /* renamed from: a, reason: collision with root package name */
        public static final c f7680a = new c();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof c);
        }

        public final int hashCode() {
            return 1969157239;
        }

        public final String toString() {
            return "Stopping";
        }
    }
}
