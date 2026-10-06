package com.github.rudroid.agents.sessionevents;

import com.github.rudroid.agents.sessionevents.l;

/* loaded from: /home/user/work/p/classes.dex */
public interface o4 {

    public static final class a implements o4 {

        /* renamed from: a, reason: collision with root package name */
        public static final a f7758a = new a();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof a);
        }

        public final int hashCode() {
            return -173523061;
        }

        public final String toString() {
            return "Abort";
        }
    }

    public static final class b implements o4 {

        /* renamed from: a, reason: collision with root package name */
        public static final b f7759a = new b();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof b);
        }

        public final int hashCode() {
            return 1300168100;
        }

        public final String toString() {
            return "Elicitation";
        }
    }

    public static final class c implements o4 {

        /* renamed from: a, reason: collision with root package name */
        public static final c f7760a = new c();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof c);
        }

        public final int hashCode() {
            return -2024228052;
        }

        public final String toString() {
            return "ExitPlan";
        }
    }

    public static final class d implements o4 {

        /* renamed from: a, reason: collision with root package name */
        public l.e f7761a;

        public d(l.e eVar) {
            k71.k.g(eVar, "response");
            this.f7761a = eVar;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof d) && k71.k.b(this.f7761a, ((d) obj).f7761a);
        }

        public final int hashCode() {
            return this.f7761a.hashCode();
        }

        public final String toString() {
            return "ExitPlanFromFreeform(response=" + this.f7761a + ")";
        }
    }

    public static final class e implements o4 {

        /* renamed from: a, reason: collision with root package name */
        public com.github.rudroid.agents.sessionevents.g f7762a;

        public e(com.github.rudroid.agents.sessionevents.g gVar) {
            k71.k.g(gVar, "freeform");
            this.f7762a = gVar;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof e) && k71.k.b(this.f7762a, ((e) obj).f7762a);
        }

        public final int hashCode() {
            return this.f7762a.hashCode();
        }

        public final String toString() {
            return "FreeformInput(freeform=" + this.f7762a + ")";
        }
    }

    public static final class f implements o4 {

        /* renamed from: a, reason: collision with root package name */
        public static final f f7763a = new f();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof f);
        }

        public final int hashCode() {
            return -237163948;
        }

        public final String toString() {
            return "Permission";
        }
    }

    public static final class g implements o4 {

        /* renamed from: a, reason: collision with root package name */
        public static final g f7764a = new g();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof g);
        }

        public final int hashCode() {
            return 795601786;
        }

        public final String toString() {
            return "SendMessage";
        }
    }

    public static final class h implements o4 {

        /* renamed from: a, reason: collision with root package name */
        public static final h f7765a = new h();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof h);
        }

        public final int hashCode() {
            return 1795682377;
        }

        public final String toString() {
            return "UserAsk";
        }
    }

    public static final class i implements o4 {

        /* renamed from: a, reason: collision with root package name */
        public l.i f7766a;

        public i(l.i iVar) {
            k71.k.g(iVar, "response");
            this.f7766a = iVar;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof i) && k71.k.b(this.f7766a, ((i) obj).f7766a);
        }

        public final int hashCode() {
            return this.f7766a.hashCode();
        }

        public final String toString() {
            return "UserAskFromFreeform(response=" + this.f7766a + ")";
        }
    }
}
