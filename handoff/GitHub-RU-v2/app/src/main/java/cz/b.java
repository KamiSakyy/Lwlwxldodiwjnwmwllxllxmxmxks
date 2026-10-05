package cz;

import com.github.service.models.response.projects.ProjectViewItemSortableValueType;
import m10.lx;
import m10.mx;

/* loaded from: /home/user/work/p/classes3.dex */
public abstract /* synthetic */ class b {
    public static final /* synthetic */ int[] a;

    static {
        int[] iArr = new int[mx.values().length];
        try {
            iArr[0] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            lx lxVar = mx.Companion;
            iArr[3] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            lx lxVar2 = mx.Companion;
            iArr[1] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            lx lxVar3 = mx.Companion;
            iArr[2] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            lx lxVar4 = mx.Companion;
            iArr[4] = 5;
        } catch (NoSuchFieldError unused5) {
        }
        int[] iArr2 = new int[ProjectViewItemSortableValueType.values().length];
        try {
            iArr2[ProjectViewItemSortableValueType.FLOAT.ordinal()] = 1;
        } catch (NoSuchFieldError unused6) {
        }
        try {
            iArr2[ProjectViewItemSortableValueType.STRING.ordinal()] = 2;
        } catch (NoSuchFieldError unused7) {
        }
        try {
            iArr2[ProjectViewItemSortableValueType.INTEGER.ordinal()] = 3;
        } catch (NoSuchFieldError unused8) {
        }
        try {
            iArr2[ProjectViewItemSortableValueType.NULL.ordinal()] = 4;
        } catch (NoSuchFieldError unused9) {
        }
        a = iArr2;
    }
}
