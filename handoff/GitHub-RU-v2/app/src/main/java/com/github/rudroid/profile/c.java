package com.github.rudroid.profile;

import yz0.j8;
import yz0.l8;

/* loaded from: /home/user/work/p/classes.dex */
public abstract class c {
    public static final a Companion = new a();

    public static final class a {
    }

    public static final class b extends c {

        /* renamed from: a, reason: collision with root package name */
        public j8 f17253a;

        public b(j8 j8Var) {
            this.f17253a = j8Var;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof b) && k71.k.b(this.f17253a, ((b) obj).f17253a);
        }

        public final int hashCode() {
            return this.f17253a.hashCode();
        }

        public final String toString() {
            return "GistItem(gist=" + this.f17253a + ")";
        }
    }

    /* renamed from: com.github.rudroid.profile.c$c, reason: collision with other inner class name */
    public static final class C0051c extends c {

        /* renamed from: a, reason: collision with root package name */
        public l8 f17254a;

        public C0051c(l8 l8Var) {
            this.f17254a = l8Var;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof C0051c) && k71.k.b(this.f17254a, ((C0051c) obj).f17254a);
        }

        public final int hashCode() {
            return this.f17254a.hashCode();
        }

        public final String toString() {
            return "RepositoryItem(repository=" + this.f17254a + ")";
        }
    }
}
