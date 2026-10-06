package um;

import com.github.service.models.response.shortcuts.ShortcutType;

/* loaded from: /home/user/work/p/classes3.dex */
public abstract /* synthetic */ class a {
    public static final /* synthetic */ int[] a;

    static {
        int[] iArr = new int[ShortcutType.values().length];
        try {
            iArr[ShortcutType.ISSUE.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[ShortcutType.PULL_REQUEST.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[ShortcutType.DISCUSSION.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr[ShortcutType.REPOSITORIES.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        a = iArr;
    }
    public Object M(Object p1, Object p2, Object p3, Object p4, Object p5) { return null; }
    public static Object O(Object p1, Object p2, Object p3) { return null; }
    public Object a(Object p1) { return null; }
    public Object a(Object) { return null; }
}
