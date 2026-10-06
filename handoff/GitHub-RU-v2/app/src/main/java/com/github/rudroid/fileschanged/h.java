package com.github.rudroid.fileschanged;

import com.github.service.models.response.type.DiffLineType;
import com.github.service.models.response.type.PatchStatus;

/* loaded from: /home/user/work/p/classes.dex */
public final class h {
    public static final a Companion = new a();

    public static final class a {
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static final class c {

        /* renamed from: r, reason: collision with root package name */
        public static final c f13314r;

        /* renamed from: s, reason: collision with root package name */
        public static final c f13315s;

        /* renamed from: t, reason: collision with root package name */
        public static final c f13316t;

        /* renamed from: u, reason: collision with root package name */
        public static final c f13317u;

        /* renamed from: v, reason: collision with root package name */
        public static final c f13318v;

        /* renamed from: w, reason: collision with root package name */
        public static final /* synthetic */ c[] f13319w;

        static {
            c cVar = new c("UP", 0);
            f13314r = cVar;
            c cVar2 = new c("UNIFIED", 1);
            f13315s = cVar2;
            c cVar3 = new c("BOTH", 2);
            f13316t = cVar3;
            c cVar4 = new c("END_OF_FILE", 3);
            f13317u = cVar4;
            c cVar5 = new c("NONE", 4);
            f13318v = cVar5;
            c[] cVarArr = {cVar, cVar2, cVar3, cVar4, cVar5};
            f13319w = cVarArr;
            v8.l0.t(cVarArr);
        }

        public static c valueOf(String str) {
            return (c) Enum.valueOf(c.class, str);
        }

        public static c[] values() {
            return (c[]) f13319w.clone();
        }
    }

    public static final /* synthetic */ class d {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f13320a;

        /* renamed from: b, reason: collision with root package name */
        public static final /* synthetic */ int[] f13321b;

        static {
            int[] iArr = new int[PatchStatus.values().length];
            try {
                iArr[PatchStatus.DELETED.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[PatchStatus.ADDED.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[PatchStatus.RENAMED.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[PatchStatus.COPIED.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[PatchStatus.MODIFIED.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[PatchStatus.CHANGED.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr[PatchStatus.UNKNOWN__.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            f13320a = iArr;
            int[] iArr2 = new int[DiffLineType.values().length];
            try {
                iArr2[DiffLineType.HUNK.ordinal()] = 1;
            } catch (NoSuchFieldError unused8) {
            }
            f13321b = iArr2;
            int[] iArr3 = new int[c.values().length];
            try {
                iArr3[0] = 1;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                c cVar = c.f13314r;
                iArr3[1] = 2;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                c cVar2 = c.f13314r;
                iArr3[2] = 3;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                c cVar3 = c.f13314r;
                iArr3[3] = 4;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                c cVar4 = c.f13314r;
                iArr3[4] = 5;
            } catch (NoSuchFieldError unused13) {
            }
        }
    }

    public static final class b {

        /* renamed from: a, reason: collision with root package name */
        public f01.f f13312a;

        /* renamed from: b, reason: collision with root package name */
        public f01.f f13313b;

        public b(f01.f fVar) {
            this.f13312a = fVar;
            this.f13313b = null;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return k71.k.b(this.f13312a, bVar.f13312a) && k71.k.b(this.f13313b, bVar.f13313b);
        }

        public final int hashCode() {
            int hashCode = this.f13312a.hashCode() * 31;
            f01.f fVar = this.f13313b;
            return hashCode + (fVar == null ? 0 : fVar.hashCode());
        }

        public final String toString() {
            return "DiffLineButtonRanges(topButtonRange=" + this.f13312a + ", bottomButtonRange=" + this.f13313b + ")";
        }

        public b(f01.f fVar, f01.f fVar2) {
            this.f13312a = fVar;
            this.f13313b = fVar2;
        }
    }
}
