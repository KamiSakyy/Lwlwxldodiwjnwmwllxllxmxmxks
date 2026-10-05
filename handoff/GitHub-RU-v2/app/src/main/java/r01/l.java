package r01;

import com.github.service.models.response.type.MobileSubjectType;

/* loaded from: /home/user/work/p/classes4.dex */
public final class l {
    public static MobileSubjectType a(String str) {
        MobileSubjectType mobileSubjectType;
        k71.k.g(str, "rawValue");
        MobileSubjectType[] values = MobileSubjectType.values();
        int length = values.length;
        int i = 0;
        while (true) {
            if (i >= length) {
                mobileSubjectType = null;
                break;
            }
            mobileSubjectType = values[i];
            if (k71.k.b(mobileSubjectType.getRawValue(), str)) {
                break;
            }
            i++;
        }
        return mobileSubjectType == null ? MobileSubjectType.UNKNOWN__ : mobileSubjectType;
    }
}
