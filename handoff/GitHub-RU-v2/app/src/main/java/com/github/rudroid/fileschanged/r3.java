package com.github.rudroid.fileschanged;

import com.github.service.models.response.type.PatchStatus;

/* loaded from: /home/user/work/p/classes.dex */
public final class r3 {

    public static final /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f13454a;

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
            f13454a = iArr;
        }
    }

    public static final boolean a(yz0.p1 p1Var) {
        if (!p1Var.f && !p1Var.g && !p1Var.h && !p1Var.j) {
            int i = a.f13454a[p1Var.i.ordinal()];
            if (i != 1) {
                if (i == 2 || i == 3) {
                    return p1Var.e.isEmpty();
                }
                return false;
            }
        }
        return true;
    }
}
