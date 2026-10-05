package com.github.rudroid.fileschanged;

import com.github.service.models.response.type.PatchStatus;

/* loaded from: /home/user/work/p/classes.dex */
public final class i {

    public static final /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f13331a;

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
            f13331a = iArr;
        }
    }

    public static final boolean a(yz0.n1 n1Var) {
        if (!n1Var.g && !n1Var.h && !n1Var.i && !n1Var.k) {
            int i = a.f13331a[n1Var.j.ordinal()];
            if (i != 1) {
                if (i == 2 || i == 3) {
                    return n1Var.f.isEmpty();
                }
                return false;
            }
        }
        return true;
    }
}
