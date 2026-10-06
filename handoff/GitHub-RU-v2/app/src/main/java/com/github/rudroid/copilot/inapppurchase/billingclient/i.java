package com.github.rudroid.copilot.inapppurchase.billingclient;

import com.github.rudroid.copilot.h1;

/* loaded from: /home/user/work/p/classes.dex */
public interface i<T> {

    public static final class a<T> implements i<T> {

        /* renamed from: a, reason: collision with root package name */
        public Object f9666a;

        public a(Object obj) {
            this.f9666a = obj;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof a) && k71.k.b(this.f9666a, ((a) obj).f9666a);
        }

        public final int hashCode() {
            Object obj = this.f9666a;
            if (obj == null) {
                return 0;
            }
            return obj.hashCode();
        }

        public final String toString() {
            return h1.l(this.f9666a, "Connected(value=", ")");
        }
    }

    public static final class b<T> implements i<T> {
    }
}
