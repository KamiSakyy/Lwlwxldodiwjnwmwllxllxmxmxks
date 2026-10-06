package com.github.rudroid.starredreposandlists;

import jo.f4Shadow;

/* loaded from: /home/user/work/p/classes3.dex */
public abstract class h implements le.z {
    public static final a Companion = new a();
    public String r;

    public static final class a {
    }

    public static final class b extends h {
        public static final b s = new b("ITEM_CREATE_LIST_EMPTY_STATE");
    }

    public static final class c extends h {
        public int s;
        public int t;
        public boolean u;

        public c(int i, int i2, boolean z) {
            super(no.a.k("ITEM_TYPE_HEADER", i2));
            this.s = i;
            this.t = i2;
            this.u = z;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof c)) {
                return false;
            }
            c cVar = (c) obj;
            return this.s == cVar.s && this.t == cVar.t && this.u == cVar.u;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.u) + a0.s0.b(this.t, Integer.hashCode(this.s) * 31, 31);
        }

        public final String toString() {
            return f4Shadow.s(x.i.m(this.s, this.t, "Header(iconRes=", ", titleRes=", ", showNewButton="), this.u, ")");
        }
    }

    public static final class d extends h {
        public String s;
        public String t;
        public int u;
        public String v;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(int i, String str, String str2, String str3) {
            super("ITEM_TYPE_LIST_ITEM".concat(str));
            k71.k.g(str, "id");
            k71.k.g(str2, "title");
            k71.k.g(str3, "slug");
            this.s = str;
            this.t = str2;
            this.u = i;
            this.v = str3;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof d)) {
                return false;
            }
            d dVar = (d) obj;
            return k71.k.b(this.s, dVar.s) && k71.k.b(this.t, dVar.t) && this.u == dVar.u && k71.k.b(this.v, dVar.v);
        }

        public final int hashCode() {
            return this.v.hashCode() + a0.s0.b(this.u, com.github.rudroid.copilot.h1.i(this.s.hashCode() * 31, this.t, 31), 31);
        }

        public final String toString() {
            return com.github.rudroid.m0.c(this.u, ", slug=", this.v, ")", a0.s0.o("List(id=", this.s, ", title=", this.t, ", repoCount="));
        }
    }

    public static final class e extends h implements com.github.rudroid.repositories.k {
        public boolean A;
        public String B;
        public String s;
        public com.github.service.models.response.a t;
        public String u;
        public boolean v;
        public String w;
        public String x;
        public int y;
        public int z;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(String str, com.github.service.models.response.a aVar, String str2, boolean z, String str3, String str4, int i, int i2, boolean z2, String str5) {
            super("ITEM_TYPE_REPOSITORY".concat(str));
            k71.k.g(str, "id");
            k71.k.g(aVar, "owner");
            k71.k.g(str2, "name");
            this.s = str;
            this.t = aVar;
            this.u = str2;
            this.v = z;
            this.w = str3;
            this.x = str4;
            this.y = i;
            this.z = i2;
            this.A = z2;
            this.B = str5;
        }

        public final com.github.service.models.response.a a() {
            return this.t;
        }

        public final String b() {
            return this.x;
        }

        public final int c() {
            return this.y;
        }

        public final boolean d() {
            return this.v;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof e)) {
                return false;
            }
            e eVar = (e) obj;
            return k71.k.b(this.s, eVar.s) && k71.k.b(this.t, eVar.t) && k71.k.b(this.u, eVar.u) && this.v == eVar.v && k71.k.b(this.w, eVar.w) && k71.k.b(this.x, eVar.x) && this.y == eVar.y && this.z == eVar.z && this.A == eVar.A && k71.k.b(this.B, eVar.B);
        }

        public final boolean f() {
            return this.A;
        }

        public final String g() {
            return this.w;
        }

        public final String getId() {
            return this.s;
        }

        public final String getName() {
            return this.u;
        }

        public final String getParent() {
            return this.B;
        }

        public final int hashCode() {
            int e = x.i.e(com.github.rudroid.copilot.h1.i(f4Shadow.b(this.t, this.s.hashCode() * 31, 31), this.u, 31), 31, this.v);
            String str = this.w;
            int hashCode = (e + (str == null ? 0 : str.hashCode())) * 31;
            String str2 = this.x;
            int e2 = x.i.e(a0.s0.b(this.z, a0.s0.b(this.y, (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31, 31), 31), 31, this.A);
            String str3 = this.B;
            return e2 + (str3 != null ? str3.hashCode() : 0);
        }

        public final int i() {
            return this.z;
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("Repository(id=");
            sb.append(this.s);
            sb.append(", owner=");
            sb.append(this.t);
            sb.append(", name=");
            com.github.rudroid.m0.x(sb, this.u, ", isPrivate=", this.v, ", descriptionHtml=");
            f1.e.x(sb, this.w, ", languageName=", this.x, ", languageColor=");
            a0.s0.z(sb, this.y, ", stargazersCount=", this.z, ", isFork=");
            return com.github.rudroid.m0.l(sb, this.A, ", parent=", this.B, ")");
        }
    }

    public static final class f extends h {
        public static final f s = new f("ITEM_TYPE_SPACER");
    }

    public static final class g extends h {
        public boolean s;

        public g(boolean z) {
            super("ITEM_STAR_REPO_EMPTY_STATE");
            this.s = z;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof g) && this.s == ((g) obj).s;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.s);
        }

        public final String toString() {
            return com.github.rudroid.m0.i("StarReposEmptyState(isViewingOwnLists=", ")", this.s);
        }
    }

    public h(String str) {
        this.r = str;
    }

    public final String E() {
        return this.r;
    }
}
