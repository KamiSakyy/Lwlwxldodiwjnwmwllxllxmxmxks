package a30;

import java.util.List;
import k71.k;
import kc0.yb0;
import sy.c0;
import u10.y90;
import y41.t1;
import y71.i;
import z01.x0;

/* loaded from: /home/user/work/p/classes3.dex */
public final class d implements x0, y90, yn.a, yb0 {
    public final /* synthetic */ int r;

    public final i a(String str, String str2, String str3, String str4) {
        switch (this.r) {
            case 0:
                k.g(str, "ownerName");
                k.g(str2, "repoName");
                k.g(str3, "baseRefName");
                k.g(str4, "headRefName");
                return t1.S("observeRefComparisonFilesChanged", "3.10");
            case 1:
                k.g(str, "ownerName");
                k.g(str2, "repoName");
                return x.i.q(str3, "baseRefName", str4, "headRefName");
            default:
                k.g(str, "ownerName");
                k.g(str2, "repoName");
                k.g(str3, "baseRefName");
                k.g(str4, "headRefName");
                return t1.S("observeRefComparisonFilesChanged", "3.12");
        }
    }

    public final i b(String str, String str2, String str3, String str4) {
        switch (this.r) {
            case 0:
                k.g(str, "ownerName");
                k.g(str2, "repoName");
                k.g(str3, "baseRefName");
                k.g(str4, "headRefName");
                return t1.S("loadRefComparisonFilesChangedPage", "3.10");
            case 1:
                k.g(str, "ownerName");
                k.g(str2, "repoName");
                return x.i.q(str3, "baseRefName", str4, "headRefName");
            default:
                k.g(str, "ownerName");
                k.g(str2, "repoName");
                k.g(str3, "baseRefName");
                k.g(str4, "headRefName");
                return t1.S("loadRefComparisonFilesChangedPage", "3.12");
        }
    }

    public final Object c(String str, String str2, String str3, String str4, String str5, List list) {
        switch (this.r) {
            case 0:
                return t1.S("refreshRefComparisonFilesChanged", "3.10");
            case 1:
                return c0.j();
            default:
                return t1.S("refreshRefComparisonFilesChanged", "3.12");
        }
    }

    public final i d(String str, String str2, String str3, String str4) {
        switch (this.r) {
            case 0:
                k.g(str, "ownerName");
                k.g(str2, "repoName");
                k.g(str3, "baseRefName");
                k.g(str4, "headRefName");
                return t1.S("refreshRefComparisonFilesChanged", "3.10");
            case 1:
                k.g(str, "ownerName");
                k.g(str2, "repoName");
                return x.i.q(str3, "baseRefName", str4, "headRefName");
            default:
                k.g(str, "ownerName");
                k.g(str2, "repoName");
                k.g(str3, "baseRefName");
                k.g(str4, "headRefName");
                return t1.S("refreshRefComparisonFilesChanged", "3.12");
        }
    }

    public final Object h() {
        int i = this.r;
        return this;
    }
}
