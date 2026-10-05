package yz0;

import com.github.service.models.response.GitObjectType;
import java.util.Locale;

/* loaded from: /home/user/work/p/classes4.dex */
public final class s1 {
    public static GitObjectType a(String str) {
        GitObjectType gitObjectType;
        GitObjectType[] values = GitObjectType.values();
        int length = values.length;
        int i = 0;
        while (true) {
            gitObjectType = null;
            String str2 = null;
            if (i >= length) {
                break;
            }
            GitObjectType gitObjectType2 = values[i];
            if (str != null) {
                str2 = str.toLowerCase(Locale.ROOT);
                k71.k.f(str2, "toLowerCase(...)");
            }
            if (k71.k.b(str2, gitObjectType2.getRawTypeNameValue())) {
                gitObjectType = gitObjectType2;
                break;
            }
            i++;
        }
        return gitObjectType == null ? GitObjectType.UNKNOWN__ : gitObjectType;
    }
}
