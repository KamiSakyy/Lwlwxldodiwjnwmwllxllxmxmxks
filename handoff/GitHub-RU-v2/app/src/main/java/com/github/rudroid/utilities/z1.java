package com.github.rudroid.utilities;

import ad.a;
import com.github.rudroid.agents.sessionevents.l;
import com.github.rudroid.fileschanged.ui.b0;
import com.github.service.models.response.RepoFileType;
import com.github.service.models.response.type.DiffLineType;
import com.github.service.models.response.type.PatchStatus;

/* loaded from: /home/user/work/p/classes3.dex */
public final class z1 {
    static {
        xn.z2 z2Var = xn.z2.s;
        x61.l.r(new l.b[]{new l.b("call_create_1", false, z2Var), new l.b("call_create_1", true, z2Var), new l.b("call_create_1", true, xn.z2.t)});
        a.g gVar = new a.g((String) null, "fileB.go", "fileB.go", (String) null, false, false, (Integer) null, (Boolean) null, 5, 0, PatchStatus.ADDED, (RepoFileType) null, (String) null, false, (String) null, (String) null, false, false, false, 226552);
        com.github.rudroid.fileschanged.ui.b0 aVar = new b0.a(com.github.rudroid.fileschanged.ui.m0.t, "@@ -0,0 +1,5 @@");
        DiffLineType diffLineType = DiffLineType.ADDITION;
        new com.github.rudroid.fileschanged.ui.a0(gVar, x61.l.r(new com.github.rudroid.fileschanged.ui.b0[]{aVar, new b0.b(new com.github.rudroid.fileschanged.ui.m(1, diffLineType, "+package main")), new b0.b(new com.github.rudroid.fileschanged.ui.m(2, diffLineType, "+")), new b0.b(new com.github.rudroid.fileschanged.ui.m(3, diffLineType, "+import \"fmt\"")), new b0.b(new com.github.rudroid.fileschanged.ui.m(4, diffLineType, "+")), new b0.b(new com.github.rudroid.fileschanged.ui.m(5, diffLineType, "+func main() { fmt.Println(\"hello\") }"))}));
    }
}
