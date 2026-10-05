package s00;

import a71.c;
import com.github.service.license.LicenseTemplate;
import com.github.service.repositorycreation.CreateRepositoryInput;
import ga1.f;
import ga1.o;
import java.util.List;
import w61.a0;

/* loaded from: /home/user/work/p/classes3.dex */
public interface a {
    @f("/licenses")
    Object a(c<? super List<LicenseTemplate>> cVar);

    @o("/user/repos")
    Object b(@ga1.a CreateRepositoryInput createRepositoryInput, c<? super a0> cVar);

    @f("/gitignore/templates")
    Object c(c<? super List<String>> cVar);
}
