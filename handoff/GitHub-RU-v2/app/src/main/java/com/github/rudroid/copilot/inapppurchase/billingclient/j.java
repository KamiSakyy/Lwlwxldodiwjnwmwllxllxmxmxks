package com.github.rudroid.copilot.inapppurchase.billingclient;

import com.github.rudroid.m0;
import java.util.List;

/* loaded from: /home/user/work/p/classes.dex */
public interface j {

    public static final class a implements j {

        /* renamed from: a, reason: collision with root package name */
        public static final a f9667a = new a();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof a);
        }

        public final int hashCode() {
            return 179511015;
        }

        public final String toString() {
            return "Failure";
        }
    }

    public static final class b implements j {

        /* renamed from: a, reason: collision with root package name */
        public static final b f9668a = new b();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof b);
        }

        public final int hashCode() {
            return -1080539999;
        }

        public final String toString() {
            return "Initial";
        }
    }

    public static final class c implements j {

        /* renamed from: a, reason: collision with root package name */
        public List f9669a;

        public c(List list) {
            this.f9669a = list;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof c) && k71.k.b(this.f9669a, ((c) obj).f9669a);
        }

        public final int hashCode() {
            return this.f9669a.hashCode();
        }

        public final String toString() {
            return m0.h("Success(purchases=", ")", this.f9669a);
        }
    }

    public static final class d implements j {

        /* renamed from: a, reason: collision with root package name */
        public static final d f9670a = new d();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof d);
        }

        public final int hashCode() {
            return 1223501155;
        }

        public final String toString() {
            return "UserCancelled";
        }
    }
    public Object s(Object p1, Object p2) { return null; }
}
