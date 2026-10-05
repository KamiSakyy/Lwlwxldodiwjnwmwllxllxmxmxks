package g11;

import com.github.service.models.response.Avatar;

/* loaded from: /home/user/work/p/classes4.dex */
public abstract /* synthetic */ class a {
    public static final /* synthetic */ int[] a;

    static {
        int[] iArr = new int[Avatar.Type.values().length];
        try {
            iArr[Avatar.Type.User.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[Avatar.Type.Organization.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        a = iArr;
    }
}
