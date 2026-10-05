package com.github.rudroid.repository.files;

import com.github.service.models.response.Language;
import java.util.ArrayList;
import java.util.List;

/* loaded from: /home/user/work/p/classes.dex */
public abstract class m implements le.z {
    public static final b Companion = new b();

    /* renamed from: r, reason: collision with root package name */
    public final int f19613r;

    public static final class a extends m {

        /* renamed from: s, reason: collision with root package name */
        public final yz0.o f19614s;

        /* renamed from: t, reason: collision with root package name */
        public final String f19615t;

        /* renamed from: u, reason: collision with root package name */
        public final boolean f19616u;

        /* renamed from: v, reason: collision with root package name */
        public final boolean f19617v;

        /* renamed from: w, reason: collision with root package name */
        public final int f19618w;

        /* renamed from: x, reason: collision with root package name */
        public final boolean f19619x;

        /* renamed from: y, reason: collision with root package name */
        public final int f19620y;

        /* renamed from: z, reason: collision with root package name */
        public final boolean f19621z;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(yz0.o oVar) {
            super(2);
            String concat = "ITEM_TYPE_SEARCH_RESULT_".concat(oVar.a);
            k71.k.g(oVar, "codeSearchResult");
            List list = oVar.e;
            int i = oVar.d;
            k71.k.g(concat, "stableId");
            this.f19614s = oVar;
            this.f19615t = concat;
            ArrayList arrayList = oVar.f;
            this.f19616u = !arrayList.isEmpty();
            Language language = oVar.b;
            this.f19617v = language.s != null && language.r.length() > 0;
            this.f19618w = i - list.size();
            this.f19619x = arrayList.size() - list.size() > 0;
            int max = Math.max(0, i - arrayList.size());
            this.f19620y = max;
            this.f19621z = max > 0;
        }

        @Override // le.z
        public final String E() {
            return this.f19615t;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return k71.k.b(this.f19614s, aVar.f19614s) && k71.k.b(this.f19615t, aVar.f19615t);
        }

        public final int hashCode() {
            return this.f19615t.hashCode() + (this.f19614s.hashCode() * 31);
        }

        public final String toString() {
            return "CodeSearchResultItem(codeSearchResult=" + this.f19614s + ", stableId=" + this.f19615t + ")";
        }
    }

    public static final class b {
    }

    public static final class d extends m {

        /* renamed from: s, reason: collision with root package name */
        public final String f19632s;

        /* renamed from: t, reason: collision with root package name */
        public final String f19633t;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(String str) {
            super(3);
            String str2 = "ITEM_TYPE_RECENT_SEARCH_HEADER_" + str;
            k71.k.g(str, "repoOwnerAndName");
            k71.k.g(str2, "stableId");
            this.f19632s = str;
            this.f19633t = str2;
        }

        @Override // le.z
        public final String E() {
            return this.f19633t;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof d)) {
                return false;
            }
            d dVar = (d) obj;
            return k71.k.b(this.f19632s, dVar.f19632s) && k71.k.b(this.f19633t, dVar.f19633t);
        }

        public final int hashCode() {
            return this.f19633t.hashCode() + (this.f19632s.hashCode() * 31);
        }

        public final String toString() {
            return x.i.g("RecentSearchHeader(repoOwnerAndName=", this.f19632s, ", stableId=", this.f19633t, ")");
        }
    }

    public static final class e extends m {

        /* renamed from: s, reason: collision with root package name */
        public final gj.a f19634s;

        /* renamed from: t, reason: collision with root package name */
        public final String f19635t;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(gj.a aVar) {
            super(4);
            String k10 = a0.s0.k("ITEM_TYPE_RECENT_SEARCH_", aVar.b, "_", aVar.a);
            k71.k.g(aVar, "recentSearch");
            k71.k.g(k10, "stableId");
            this.f19634s = aVar;
            this.f19635t = k10;
        }

        @Override // le.z
        public final String E() {
            return this.f19635t;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof e)) {
                return false;
            }
            e eVar = (e) obj;
            return k71.k.b(this.f19634s, eVar.f19634s) && k71.k.b(this.f19635t, eVar.f19635t);
        }

        public final int hashCode() {
            return this.f19635t.hashCode() + (this.f19634s.hashCode() * 31);
        }

        public final String toString() {
            return "RecentSearchItem(recentSearch=" + this.f19634s + ", stableId=" + this.f19635t + ")";
        }
    }

    public m(int i) {
        this.f19613r = i;
    }

    public static final class c extends m {

        /* renamed from: s, reason: collision with root package name */
        public final String f19622s;

        /* renamed from: t, reason: collision with root package name */
        public final String f19623t;

        /* renamed from: u, reason: collision with root package name */
        public final int f19624u;

        /* renamed from: v, reason: collision with root package name */
        public final int f19625v;

        /* renamed from: w, reason: collision with root package name */
        public final a f19626w;

        /* renamed from: x, reason: collision with root package name */
        public final String f19627x;

        /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
        /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
        public static final class a {

            /* renamed from: r, reason: collision with root package name */
            public static final a f19628r;

            /* renamed from: s, reason: collision with root package name */
            public static final a f19629s;

            /* renamed from: t, reason: collision with root package name */
            public static final a f19630t;

            /* renamed from: u, reason: collision with root package name */
            public static final /* synthetic */ a[] f19631u;

            static {
                a aVar = new a("FILE", 0);
                f19628r = aVar;
                a aVar2 = new a("DIRECTORY", 1);
                f19629s = aVar2;
                a aVar3 = new a("SUBMODULE", 2);
                f19630t = aVar3;
                a[] aVarArr = {aVar, aVar2, aVar3};
                f19631u = aVarArr;
                v8.l0.t(aVarArr);
            }

            public static a valueOf(String str) {
                return (a) Enum.valueOf(a.class, str);
            }

            public static a[] values() {
                return (a[]) f19631u.clone();
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(String str, String str2, int i, int i10, a aVar, String str3) {
            super(1);
            k71.k.g(str, "stableId");
            k71.k.g(str3, "repoUrl");
            this.f19622s = str;
            this.f19623t = str2;
            this.f19624u = i;
            this.f19625v = i10;
            this.f19626w = aVar;
            this.f19627x = str3;
        }

        @Override // le.z
        public final String E() {
            return this.f19622s;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof c)) {
                return false;
            }
            c cVar = (c) obj;
            return k71.k.b(this.f19622s, cVar.f19622s) && k71.k.b(this.f19623t, cVar.f19623t) && this.f19624u == cVar.f19624u && this.f19625v == cVar.f19625v && this.f19626w == cVar.f19626w && k71.k.b(this.f19627x, cVar.f19627x);
        }

        public final int hashCode() {
            return this.f19627x.hashCode() + ((this.f19626w.hashCode() + a0.s0.b(this.f19625v, a0.s0.b(this.f19624u, com.github.rudroid.copilot.h1.i(this.f19622s.hashCode() * 31, this.f19623t, 31), 31), 31)) * 31);
        }

        public final String toString() {
            StringBuilder o5 = a0.s0.o("FileOrDirectoryItem(stableId=", this.f19622s, ", name=", this.f19623t, ", textIcon=");
            a0.s0.z(o5, this.f19624u, ", colorRes=", this.f19625v, ", type=");
            o5.append(this.f19626w);
            o5.append(", repoUrl=");
            o5.append(this.f19627x);
            o5.append(")");
            return o5.toString();
        }

        public /* synthetic */ c(String str, String str2, int i, int i10, a aVar) {
            this(str, str2, i, i10, aVar, "");
        }
    }
}
