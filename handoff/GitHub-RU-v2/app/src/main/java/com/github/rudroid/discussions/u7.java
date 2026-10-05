package com.github.rudroid.discussions;

import java.util.List;

/* loaded from: /home/user/work/p/classes.dex */
public abstract class u7 implements le.z {
    public static final a Companion = new a();

    /* renamed from: r, reason: collision with root package name */
    public final int f11853r;

    /* renamed from: s, reason: collision with root package name */
    public final String f11854s;

    public static final class a {
    }

    public static final class b extends u7 {

        /* renamed from: t, reason: collision with root package name */
        public final String f11855t;

        /* renamed from: u, reason: collision with root package name */
        public final String f11856u;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(String str, String str2) {
            super("category", 3);
            k71.k.g(str, "name");
            k71.k.g(str2, "emojiHTML");
            this.f11855t = str;
            this.f11856u = str2;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return k71.k.b(this.f11855t, bVar.f11855t) && k71.k.b(this.f11856u, bVar.f11856u);
        }

        public final int hashCode() {
            return this.f11856u.hashCode() + (this.f11855t.hashCode() * 31);
        }

        public final String toString() {
            return x.i.g("DiscussionTriageCategory(name=", this.f11855t, ", emojiHTML=", this.f11856u, ")");
        }
    }

    public static final class c extends u7 {

        /* renamed from: t, reason: collision with root package name */
        public final Object f11857t;

        public c(List list) {
            super("labels", 4);
            this.f11857t = list;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof c) && this.f11857t.equals(((c) obj).f11857t);
        }

        public final int hashCode() {
            return this.f11857t.hashCode();
        }

        public final String toString() {
            return com.github.rudroid.copilot.h1.l(this.f11857t, "DiscussionTriageLabels(labels=", ")");
        }
    }

    public static final class d extends u7 {

        /* renamed from: t, reason: collision with root package name */
        public static final d f11858t = new d("sectionfooter", 2);
    }

    public static final class e extends u7 {

        /* renamed from: t, reason: collision with root package name */
        public final f f11859t;

        /* renamed from: u, reason: collision with root package name */
        public final boolean f11860u;

        public e(f fVar, boolean z10) {
            super(x.i.f(fVar.name(), "header"), 1);
            this.f11859t = fVar;
            this.f11860u = z10;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof e)) {
                return false;
            }
            e eVar = (e) obj;
            return this.f11859t == eVar.f11859t && this.f11860u == eVar.f11860u;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.f11860u) + (this.f11859t.hashCode() * 31);
        }

        public final String toString() {
            return "DiscussionTriageSectionHeader(sectionType=" + this.f11859t + ", canEdit=" + this.f11860u + ")";
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static final class f {

        /* renamed from: s, reason: collision with root package name */
        public static final f f11861s;

        /* renamed from: t, reason: collision with root package name */
        public static final f f11862t;

        /* renamed from: u, reason: collision with root package name */
        public static final /* synthetic */ f[] f11863u;

        /* renamed from: r, reason: collision with root package name */
        public final int f11864r;

        static {
            f fVar = new f(0, "CATEGORY", 2131954783);
            f11861s = fVar;
            f fVar2 = new f(1, "LABELS", 2131954789);
            f11862t = fVar2;
            f[] fVarArr = {fVar, fVar2};
            f11863u = fVarArr;
            v8.l0.t(fVarArr);
        }

        public f(int i, String str, int i10) {
            this.f11864r = i10;
        }

        public static f valueOf(String str) {
            return (f) Enum.valueOf(f.class, str);
        }

        public static f[] values() {
            return (f[]) f11863u.clone();
        }
    }

    public u7(String str, int i) {
        this.f11853r = i;
        this.f11854s = str;
    }

    @Override // le.z
    public final String E() {
        return this.f11854s;
    }
}
