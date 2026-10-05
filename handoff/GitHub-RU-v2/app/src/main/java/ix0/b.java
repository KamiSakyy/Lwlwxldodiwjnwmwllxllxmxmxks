package ix0;

import com.github.service.models.response.projects.ProjectViewItemSortableValueType;
import pz0.as;
import pz0.bs;

/* loaded from: /home/user/work/p/classes4.dex */
public abstract /* synthetic */ class b {
    public static final /* synthetic */ int[] a;

    static {
        int[] iArr = new int[bs.values().length];
        try {
            iArr[0] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            as asVar = bs.Companion;
            iArr[3] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            as asVar2 = bs.Companion;
            iArr[1] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            as asVar3 = bs.Companion;
            iArr[2] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            as asVar4 = bs.Companion;
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
