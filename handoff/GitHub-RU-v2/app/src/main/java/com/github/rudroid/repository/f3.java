package com.github.rudroid.repository;

import com.github.service.models.response.type.StatusState;
import java.util.ArrayList;

/* loaded from: /home/user/work/p/classes.dex */
public abstract class f3 implements zh.b {
    public static final b Companion = new b();

    /* renamed from: r, reason: collision with root package name */
    public final int f19308r;

    public static final class a extends f3 {

        /* renamed from: s, reason: collision with root package name */
        public final String f19309s;

        /* renamed from: t, reason: collision with root package name */
        public final int f19310t;

        /* renamed from: u, reason: collision with root package name */
        public final StatusState f19311u;

        /* renamed from: v, reason: collision with root package name */
        public final boolean f19312v;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(String str, int i, StatusState statusState, boolean z10) {
            super(4);
            k71.k.g(str, "name");
            k71.k.g(statusState, "statusState");
            this.f19309s = str;
            this.f19310t = i;
            this.f19311u = statusState;
            this.f19312v = z10;
        }

        public final String E() {
            return "branch_item";
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return k71.k.b(this.f19309s, aVar.f19309s) && this.f19310t == aVar.f19310t && this.f19311u == aVar.f19311u && this.f19312v == aVar.f19312v;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.f19312v) + ((this.f19311u.hashCode() + a0.s0.b(this.f19310t, this.f19309s.hashCode() * 31, 31)) * 31);
        }

        public final String toString() {
            StringBuilder n10 = a0.s0.n(this.f19310t, "BranchItem(name=", this.f19309s, ", numBranches=", ", statusState=");
            n10.append(this.f19311u);
            n10.append(", statusVisible=");
            n10.append(this.f19312v);
            n10.append(")");
            return n10.toString();
        }
    }

    public static final class b {
    }

    public static final class c extends f3 {

        /* renamed from: s, reason: collision with root package name */
        public final p01.j f19313s;

        /* renamed from: t, reason: collision with root package name */
        public final String f19314t;

        /* renamed from: u, reason: collision with root package name */
        public final boolean f19315u;

        /* renamed from: v, reason: collision with root package name */
        public final String f19316v;

        /* renamed from: w, reason: collision with root package name */
        public final String f19317w;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(p01.j jVar, String str, boolean z10, String str2) {
            super(1);
            k71.k.g(jVar, "repository");
            k71.k.g(str2, "viewerLogin");
            this.f19313s = jVar;
            this.f19314t = str;
            this.f19315u = z10;
            this.f19316v = str2;
            this.f19317w = "repository_header:".concat(jVar.u);
        }

        public final String E() {
            return this.f19317w;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof c)) {
                return false;
            }
            c cVar = (c) obj;
            return k71.k.b(this.f19313s, cVar.f19313s) && k71.k.b(this.f19314t, cVar.f19314t) && this.f19315u == cVar.f19315u && k71.k.b(this.f19316v, cVar.f19316v);
        }

        public final int hashCode() {
            return this.f19316v.hashCode() + x.i.e(com.github.rudroid.copilot.h1.i(this.f19313s.hashCode() * 31, this.f19314t, 31), 31, this.f19315u);
        }

        public final String toString() {
            StringBuilder sb2 = new StringBuilder("HeaderItem(repository=");
            sb2.append(this.f19313s);
            sb2.append(", html=");
            sb2.append(this.f19314t);
            sb2.append(", showForkRepositoryButton=");
            return com.github.rudroid.m0.l(sb2, this.f19315u, ", viewerLogin=", this.f19316v, ")");
        }
    }

    public static final class d extends f3 {

        /* renamed from: s, reason: collision with root package name */
        public final int f19318s;

        /* renamed from: t, reason: collision with root package name */
        public final String f19319t;

        /* renamed from: u, reason: collision with root package name */
        public final a f19320u;

        /* renamed from: v, reason: collision with root package name */
        public final Integer f19321v;

        /* renamed from: w, reason: collision with root package name */
        public final Integer f19322w;

        /* renamed from: x, reason: collision with root package name */
        public final int f19323x;

        /* renamed from: y, reason: collision with root package name */
        public final Integer f19324y;

        /* renamed from: z, reason: collision with root package name */
        public final String f19325z;

        /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
        /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
        public static final class a {
            public static final a A;
            public static final a B;
            public static final a C;
            public static final a D;
            public static final /* synthetic */ a[] E;

            /* renamed from: r, reason: collision with root package name */
            public static final a f19326r;

            /* renamed from: s, reason: collision with root package name */
            public static final a f19327s;

            /* renamed from: t, reason: collision with root package name */
            public static final a f19328t;

            /* renamed from: u, reason: collision with root package name */
            public static final a f19329u;

            /* renamed from: v, reason: collision with root package name */
            public static final a f19330v;

            /* renamed from: w, reason: collision with root package name */
            public static final a f19331w;

            /* renamed from: x, reason: collision with root package name */
            public static final a f19332x;

            /* renamed from: y, reason: collision with root package name */
            public static final a f19333y;

            /* renamed from: z, reason: collision with root package name */
            public static final a f19334z;

            static {
                a aVar = new a("PULL_REQUESTS", 0);
                f19326r = aVar;
                a aVar2 = new a("DISCUSSIONS", 1);
                f19327s = aVar2;
                a aVar3 = new a("ISSUES", 2);
                f19328t = aVar3;
                a aVar4 = new a("MERGE_QUEUE", 3);
                f19329u = aVar4;
                a aVar5 = new a("BROWSE_CODE", 4);
                f19330v = aVar5;
                a aVar6 = new a("COMMITS", 5);
                f19331w = aVar6;
                a aVar7 = new a("WATCHERS", 6);
                f19332x = aVar7;
                a aVar8 = new a("LICENSE", 7);
                f19333y = aVar8;
                a aVar9 = new a("MORE", 8);
                f19334z = aVar9;
                a aVar10 = new a("CONTRIBUTORS", 9);
                A = aVar10;
                a aVar11 = new a("PROJECTS", 10);
                B = aVar11;
                a aVar12 = new a("ACTIONS", 11);
                C = aVar12;
                a aVar13 = new a("AGENT_TASKS", 12);
                D = aVar13;
                a[] aVarArr = {aVar, aVar2, aVar3, aVar4, aVar5, aVar6, aVar7, aVar8, aVar9, aVar10, aVar11, aVar12, aVar13};
                E = aVarArr;
                v8.l0.t(aVarArr);
            }

            public static a valueOf(String str) {
                return (a) Enum.valueOf(a.class, str);
            }

            public static a[] values() {
                return (a[]) E.clone();
            }
        }

        public /* synthetic */ d(int i, String str, a aVar, Integer num, Integer num2, int i10) {
            this(i, str, aVar, num, num2, (i10 & 32) != 0 ? 2131099913 : 2131099947, null);
        }

        public final String E() {
            return this.f19325z;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof d)) {
                return false;
            }
            d dVar = (d) obj;
            return this.f19318s == dVar.f19318s && k71.k.b(this.f19319t, dVar.f19319t) && this.f19320u == dVar.f19320u && k71.k.b(this.f19321v, dVar.f19321v) && k71.k.b(this.f19322w, dVar.f19322w) && this.f19323x == dVar.f19323x && k71.k.b(this.f19324y, dVar.f19324y);
        }

        public final int hashCode() {
            int hashCode = (this.f19320u.hashCode() + com.github.rudroid.copilot.h1.i(Integer.hashCode(this.f19318s) * 31, this.f19319t, 31)) * 31;
            Integer num = this.f19321v;
            int hashCode2 = (hashCode + (num == null ? 0 : num.hashCode())) * 31;
            Integer num2 = this.f19322w;
            int b10 = a0.s0.b(this.f19323x, (hashCode2 + (num2 == null ? 0 : num2.hashCode())) * 31, 31);
            Integer num3 = this.f19324y;
            return b10 + (num3 != null ? num3.hashCode() : 0);
        }

        public final String toString() {
            StringBuilder n10 = x.i.n(this.f19318s, "MenuButtonItem(title=", ", subtitle=", this.f19319t, ", type=");
            n10.append(this.f19320u);
            n10.append(", iconResId=");
            n10.append(this.f19321v);
            n10.append(", backgroundTintId=");
            n10.append(this.f19322w);
            n10.append(", iconTintId=");
            n10.append(this.f19323x);
            n10.append(", subtitleIcon=");
            n10.append(this.f19324y);
            n10.append(")");
            return n10.toString();
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(int i, String str, a aVar, Integer num, Integer num2, int i10, Integer num3) {
            super(2);
            k71.k.g(str, "subtitle");
            k71.k.g(aVar, "type");
            this.f19318s = i;
            this.f19319t = str;
            this.f19320u = aVar;
            this.f19321v = num;
            this.f19322w = num2;
            this.f19323x = i10;
            this.f19324y = num3;
            this.f19325z = no.a.j(i, aVar.ordinal(), "menu_button:", ":");
        }
    }

    public static final class e extends f3 {

        /* renamed from: s, reason: collision with root package name */
        public final int f19335s;

        /* renamed from: t, reason: collision with root package name */
        public final String f19336t;

        /* renamed from: u, reason: collision with root package name */
        public final Integer f19337u;

        /* renamed from: v, reason: collision with root package name */
        public final Integer f19338v;

        /* renamed from: w, reason: collision with root package name */
        public final p01.d f19339w;

        /* renamed from: x, reason: collision with root package name */
        public final String f19340x;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(int i, String str, Integer num, Integer num2, p01.d dVar) {
            super(5);
            k71.k.g(str, "subtitle");
            this.f19335s = i;
            this.f19336t = str;
            this.f19337u = num;
            this.f19338v = num2;
            this.f19339w = dVar;
            this.f19340x = no.a.k("menu_releases_button:", i);
        }

        public final String E() {
            return this.f19340x;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof e)) {
                return false;
            }
            e eVar = (e) obj;
            return this.f19335s == eVar.f19335s && k71.k.b(this.f19336t, eVar.f19336t) && k71.k.b(this.f19337u, eVar.f19337u) && k71.k.b(this.f19338v, eVar.f19338v) && k71.k.b(this.f19339w, eVar.f19339w);
        }

        public final int hashCode() {
            int i = com.github.rudroid.copilot.h1.i(Integer.hashCode(this.f19335s) * 31, this.f19336t, 31);
            Integer num = this.f19337u;
            int hashCode = (i + (num == null ? 0 : num.hashCode())) * 31;
            Integer num2 = this.f19338v;
            int hashCode2 = (hashCode + (num2 == null ? 0 : num2.hashCode())) * 31;
            p01.d dVar = this.f19339w;
            return hashCode2 + (dVar != null ? dVar.hashCode() : 0);
        }

        public final String toString() {
            StringBuilder n10 = x.i.n(this.f19335s, "MenuReleasesButtonItem(title=", ", subtitle=", this.f19336t, ", iconResId=");
            n10.append(this.f19337u);
            n10.append(", backgroundTintId=");
            n10.append(this.f19338v);
            n10.append(", latestReleaseContent=");
            n10.append(this.f19339w);
            n10.append(")");
            return n10.toString();
        }
    }

    public static final class f extends f3 {

        /* renamed from: s, reason: collision with root package name */
        public final String f19341s;

        /* renamed from: t, reason: collision with root package name */
        public final boolean f19342t;

        public f(String str, boolean z10) {
            super(7);
            this.f19341s = str;
            this.f19342t = z10;
        }

        public final String E() {
            return "readmepath";
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof f)) {
                return false;
            }
            f fVar = (f) obj;
            return k71.k.b(this.f19341s, fVar.f19341s) && this.f19342t == fVar.f19342t;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.f19342t) + (this.f19341s.hashCode() * 31);
        }

        public final String toString() {
            return com.github.rudroid.copilot.h1.n("ReadmeHeader(path=", this.f19341s, ", isEditable=", ")", this.f19342t);
        }
    }

    public static final class g extends f3 {
        public final String E() {
            return "headerdivider";
        }

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof g);
        }

        public final int hashCode() {
            return -356866068;
        }

        public final String toString() {
            return "SectionDividerItem(id=headerdivider)";
        }
    }

    public static final class h extends f3 {

        /* renamed from: s, reason: collision with root package name */
        public final String f19343s;

        public h() {
            super(3);
            this.f19343s = "spacer:footer_spacer";
        }

        public final String E() {
            return this.f19343s;
        }

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof h);
        }

        public final int hashCode() {
            return Integer.hashCode(2131165317) - 1293326672;
        }

        public final String toString() {
            return "SpacerItem(uniqueId=footer_spacer, heightResId=2131165317)";
        }
    }

    public static final class i extends f3 {

        /* renamed from: s, reason: collision with root package name */
        public final ArrayList f19344s;

        /* renamed from: t, reason: collision with root package name */
        public final boolean f19345t;

        public i(ArrayList arrayList, boolean z10) {
            super(6);
            this.f19344s = arrayList;
            this.f19345t = z10;
        }

        public final String E() {
            return "top_contributors";
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof i)) {
                return false;
            }
            i iVar = (i) obj;
            return this.f19344s.equals(iVar.f19344s) && this.f19345t == iVar.f19345t;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.f19345t) + (this.f19344s.hashCode() * 31);
        }

        public final String toString() {
            return "TopContributorsItem(topTopContributors=" + this.f19344s + ", viewAllButtonVisible=" + this.f19345t + ")";
        }
    }

    public f3(int i10) {
        this.f19308r = i10;
    }

    public final int h() {
        return this.f19308r;
    }
}
