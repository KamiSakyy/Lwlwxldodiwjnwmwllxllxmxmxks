package l01;

import com.github.service.models.response.projects.ProjectViewLayoutType;

/* loaded from: /home/user/work/p/classes4.dex */
public final class r0 {
    public static ProjectViewLayoutType a(String str) {
        ProjectViewLayoutType projectViewLayoutType;
        ProjectViewLayoutType[] values = ProjectViewLayoutType.values();
        int length = values.length;
        int i = 0;
        while (true) {
            if (i >= length) {
                projectViewLayoutType = null;
                break;
            }
            projectViewLayoutType = values[i];
            if (k71.k.b(projectViewLayoutType.getRawValue(), str)) {
                break;
            }
            i++;
        }
        return projectViewLayoutType == null ? ProjectViewLayoutType.UNKNOWN : projectViewLayoutType;
    }
}
