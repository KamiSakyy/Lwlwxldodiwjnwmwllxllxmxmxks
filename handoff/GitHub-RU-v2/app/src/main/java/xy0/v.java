package xy0;

import com.github.service.models.response.projects.ProjectViewItemSortableValueType;

/* loaded from: /home/user/work/p/classes4.dex */
public abstract /* synthetic */ class v {
    public static final /* synthetic */ int[] a;

    static {
        int[] iArr = new int[ProjectViewItemSortableValueType.values().length];
        try {
            iArr[ProjectViewItemSortableValueType.STRING.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[ProjectViewItemSortableValueType.INTEGER.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[ProjectViewItemSortableValueType.FLOAT.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr[ProjectViewItemSortableValueType.NULL.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        a = iArr;
    }
}
