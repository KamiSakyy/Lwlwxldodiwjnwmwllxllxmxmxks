package com.github.rudroid.home;

import com.github.domain.shortcuts.model.StoredShortcutModel;
import com.github.service.models.response.Avatar;
import com.github.service.models.response.SimpleRepository;
import jo.f4Shadow;
import yz0.d3;
import yz0.i3;

/* loaded from: /home/user/work/p/classes.dex */
public abstract class b2 implements le.z {
    public static final b Companion = new b();

    /* renamed from: r, reason: collision with root package name */
    public int f14886r;

    /* renamed from: s, reason: collision with root package name */
    public String f14887s;

    public static final class a extends b2 {

        /* renamed from: t, reason: collision with root package name */
        public static final a f14888t = new a("AgentsSection", 14);
    }

    public static final class b {
    }

    public static final class c extends b2 {

        /* renamed from: t, reason: collision with root package name */
        public static final c f14889t = new c("EmptyFavorites", 5);
    }

    public static final class d extends b2 {

        /* renamed from: t, reason: collision with root package name */
        public static final d f14890t = new d("EmptyShortcuts", 6);
    }

    public static final class e extends b2 {

        /* renamed from: t, reason: collision with root package name */
        public xk.g f14891t;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(xk.g gVar) {
            super("GhesDeprecationBannerItem", 10);
            k71.k.g(gVar, "data");
            this.f14891t = gVar;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof e) && k71.k.b(this.f14891t, ((e) obj).f14891t);
        }

        public final int hashCode() {
            return this.f14891t.hashCode();
        }

        public final String toString() {
            return "GhesDeprecationBannerItem(data=" + this.f14891t + ")";
        }
    }

    public static final class f extends b2 {

        /* renamed from: t, reason: collision with root package name */
        public boolean f14892t;

        public f(boolean z10) {
            super("MissedTwoFactor", 13);
            this.f14892t = z10;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof f) && this.f14892t == ((f) obj).f14892t;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.f14892t) - 1032399424;
        }

        public final String toString() {
            return com.github.rudroid.m0.i("MissedTwoFactorBannerItem(id=MissedTwoFactor, hasSeenOnboarding=", ")", this.f14892t);
        }
    }

    public static abstract class g extends b2 {

        /* renamed from: t, reason: collision with root package name */
        public vc.a f14893t;

        public static final class a extends g {

            /* renamed from: u, reason: collision with root package name */
            public static final a f14894u = new a(vc.a.f32874t);
        }

        public static final class b extends g {

            /* renamed from: u, reason: collision with root package name */
            public static final b f14895u = new b(vc.a.f32872r);
        }

        public static final class c extends g {

            /* renamed from: u, reason: collision with root package name */
            public static final c f14896u = new c(vc.a.f32878x);
        }

        public static final class d extends g {

            /* renamed from: u, reason: collision with root package name */
            public static final d f14897u = new d(vc.a.H);
        }

        public static final class e extends g {

            /* renamed from: u, reason: collision with root package name */
            public static final e f14898u = new e(vc.a.f32873s);
        }

        public static final class f extends g {

            /* renamed from: u, reason: collision with root package name */
            public static final f f14899u = new f(vc.a.f32876v);
        }

        /* renamed from: com.github.rudroid.home.b2$g$g, reason: collision with other inner class name */
        public static final class C0037g extends g {

            /* renamed from: u, reason: collision with root package name */
            public static final C0037g f14900u = new C0037g(vc.a.f32880z);
        }

        public g(vc.a aVar) {
            super(aVar.name(), 2);
            this.f14893t = aVar;
        }
    }

    public static final class h extends b2 {
        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof h);
        }

        public final int hashCode() {
            return -2065097884;
        }

        public final String toString() {
            return "NotificationsDisabledBannerItem(id=NotificationsDisabled)";
        }
    }

    public static final class i extends b2 {

        /* renamed from: t, reason: collision with root package name */
        public SimpleRepository f14901t;

        /* renamed from: u, reason: collision with root package name */
        public String f14902u;

        /* renamed from: v, reason: collision with root package name */
        public String f14903v;

        /* renamed from: w, reason: collision with root package name */
        public String f14904w;

        /* renamed from: x, reason: collision with root package name */
        public Avatar f14905x;

        /* JADX WARN: Illegal instructions before constructor call */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public i(SimpleRepository simpleRepository) {
            super(x.i.k(r4, "/", r0, "/", r1), 4);
            k71.k.g(simpleRepository, "repo");
            String str = simpleRepository.r;
            String str2 = simpleRepository.s;
            String str3 = simpleRepository.t;
            Avatar avatar = simpleRepository.u;
            k71.k.g(str, "name");
            k71.k.g(str2, "id");
            k71.k.g(str3, "repoOwner");
            k71.k.g(avatar, "avatar");
            StringBuilder sb2 = new StringBuilder();
            sb2.append(str3);
            this.f14901t = simpleRepository;
            this.f14902u = str;
            this.f14903v = str2;
            this.f14904w = str3;
            this.f14905x = avatar;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof i)) {
                return false;
            }
            i iVar = (i) obj;
            return k71.k.b(this.f14901t, iVar.f14901t) && k71.k.b(this.f14902u, iVar.f14902u) && k71.k.b(this.f14903v, iVar.f14903v) && k71.k.b(this.f14904w, iVar.f14904w) && k71.k.b(this.f14905x, iVar.f14905x);
        }

        public final int hashCode() {
            return this.f14905x.hashCode() + com.github.rudroid.copilot.h1.i(com.github.rudroid.copilot.h1.i(com.github.rudroid.copilot.h1.i(this.f14901t.hashCode() * 31, this.f14902u, 31), this.f14903v, 31), this.f14904w, 31);
        }

        public final String toString() {
            StringBuilder sb2 = new StringBuilder("PinnedRepoItem(repository=");
            sb2.append(this.f14901t);
            sb2.append(", name=");
            sb2.append(this.f14902u);
            sb2.append(", id=");
            f1.e.x(sb2, this.f14903v, ", repoOwner=", this.f14904w, ", avatar=");
            sb2.append(this.f14905x);
            sb2.append(")");
            return sb2.toString();
        }
    }

    public static final class j extends b2 {

        /* renamed from: t, reason: collision with root package name */
        public g01.f f14906t;

        /* renamed from: u, reason: collision with root package name */
        public i3 f14907u;

        /* renamed from: v, reason: collision with root package name */
        public boolean f14908v;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public j(g01.f fVar) {
            super(fVar.b, 3);
            d3 d3Var = new d3(fVar.f, fVar.e);
            boolean b10 = k71.k.b(fVar.g, Boolean.FALSE);
            k71.k.g(fVar, "recentActivity");
            this.f14906t = fVar;
            this.f14907u = d3Var;
            this.f14908v = b10;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof j)) {
                return false;
            }
            j jVar = (j) obj;
            return k71.k.b(this.f14906t, jVar.f14906t) && k71.k.b(this.f14907u, jVar.f14907u) && this.f14908v == jVar.f14908v;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.f14908v) + ((this.f14907u.hashCode() + (this.f14906t.hashCode() * 31)) * 31);
        }

        public final String toString() {
            StringBuilder sb2 = new StringBuilder("RecentActivityItem(recentActivity=");
            sb2.append(this.f14906t);
            sb2.append(", owner=");
            sb2.append(this.f14907u);
            sb2.append(", isUnread=");
            return f4Shadow.s(sb2, this.f14908v, ")");
        }
    }

    public static final class k extends b2 {

        /* renamed from: t, reason: collision with root package name */
        public String f14909t;

        public k(String str) {
            super(str, 8);
            this.f14909t = str;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof k) && k71.k.b(this.f14909t, ((k) obj).f14909t);
        }

        public final int hashCode() {
            return this.f14909t.hashCode();
        }

        public final String toString() {
            return f1.e.z("SectionDividerItem(id=", this.f14909t, ")");
        }
    }

    public static final class l extends b2 {

        /* renamed from: t, reason: collision with root package name */
        public int f14910t;

        /* renamed from: u, reason: collision with root package name */
        public vc.c f14911u;

        /* renamed from: v, reason: collision with root package name */
        public boolean f14912v;

        public l(int i, vc.c cVar, boolean z10) {
            super(cVar.name(), 1);
            this.f14910t = i;
            this.f14911u = cVar;
            this.f14912v = z10;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof l)) {
                return false;
            }
            l lVar = (l) obj;
            return this.f14910t == lVar.f14910t && this.f14911u == lVar.f14911u && this.f14912v == lVar.f14912v;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.f14912v) + ((this.f14911u.hashCode() + (Integer.hashCode(this.f14910t) * 31)) * 31);
        }

        public final String toString() {
            StringBuilder sb2 = new StringBuilder("SectionHeaderItem(titleRes=");
            sb2.append(this.f14910t);
            sb2.append(", section=");
            sb2.append(this.f14911u);
            sb2.append(", isEditable=");
            return f4Shadow.s(sb2, this.f14912v, ")");
        }
    }

    public static final class m extends b2 {

        /* renamed from: t, reason: collision with root package name */
        public String f14913t;

        /* renamed from: u, reason: collision with root package name */
        public StoredShortcutModel f14914u;

        /* JADX WARN: Illegal instructions before constructor call */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public m(StoredShortcutModel storedShortcutModel) {
            super(r0, 7);
            k71.k.g(storedShortcutModel, "shortcut");
            String obj = storedShortcutModel.u.toString();
            k71.k.g(obj, "id");
            this.f14913t = obj;
            this.f14914u = storedShortcutModel;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof m)) {
                return false;
            }
            m mVar = (m) obj;
            return k71.k.b(this.f14913t, mVar.f14913t) && k71.k.b(this.f14914u, mVar.f14914u);
        }

        public final int hashCode() {
            return this.f14914u.hashCode() + (this.f14913t.hashCode() * 31);
        }

        public final String toString() {
            return "ShortcutItem(id=" + this.f14913t + ", shortcut=" + this.f14914u + ")";
        }
    }

    public static final class n extends b2 {
        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof n);
        }

        public final int hashCode() {
            return 318320140;
        }

        public final String toString() {
            return "StaffBannerItem(id=StaffBanner)";
        }
    }

    public static final class o extends b2 {

        /* renamed from: t, reason: collision with root package name */
        public hd.a f14915t;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public o(hd.a aVar) {
            super("UpdateAvailableBannerItem", 11);
            k71.k.g(aVar, "data");
            this.f14915t = aVar;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof o) && this.f14915t == ((o) obj).f14915t;
        }

        public final int hashCode() {
            return this.f14915t.hashCode();
        }

        public final String toString() {
            return "UpdateAvailableBannerItem(data=" + this.f14915t + ")";
        }
    }

    public b2(String str, int i10) {
        this.f14886r = i10;
        this.f14887s = str;
    }

    @Override // le.z
    public final String E() {
        return this.f14887s;
    }
}
