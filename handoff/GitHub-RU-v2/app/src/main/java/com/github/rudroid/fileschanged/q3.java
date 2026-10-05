package com.github.rudroid.fileschanged;

import com.github.rudroid.fileschanged.h;
import com.github.service.models.response.type.DiffLineType;
import com.github.service.models.response.type.PatchStatus;

/* loaded from: /home/user/work/p/classes.dex */
public final class q3 {
    public static final a Companion = new a();

    public static final class a {
    }

    public static final /* synthetic */ class b {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f13447a;

        /* renamed from: b, reason: collision with root package name */
        public static final /* synthetic */ int[] f13448b;

        static {
            int[] iArr = new int[DiffLineType.values().length];
            try {
                iArr[DiffLineType.HUNK.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            f13447a = iArr;
            int[] iArr2 = new int[h.c.values().length];
            try {
                iArr2[0] = 1;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                h.c cVar = h.c.f13314r;
                iArr2[1] = 2;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                h.c cVar2 = h.c.f13314r;
                iArr2[2] = 3;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                h.c cVar3 = h.c.f13314r;
                iArr2[3] = 4;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                h.c cVar4 = h.c.f13314r;
                iArr2[4] = 5;
            } catch (NoSuchFieldError unused6) {
            }
            int[] iArr3 = new int[PatchStatus.values().length];
            try {
                iArr3[PatchStatus.DELETED.ordinal()] = 1;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr3[PatchStatus.ADDED.ordinal()] = 2;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                iArr3[PatchStatus.RENAMED.ordinal()] = 3;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                iArr3[PatchStatus.COPIED.ordinal()] = 4;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                iArr3[PatchStatus.MODIFIED.ordinal()] = 5;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                iArr3[PatchStatus.CHANGED.ordinal()] = 6;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                iArr3[PatchStatus.UNKNOWN__.ordinal()] = 7;
            } catch (NoSuchFieldError unused13) {
            }
            f13448b = iArr3;
        }
    }
}
