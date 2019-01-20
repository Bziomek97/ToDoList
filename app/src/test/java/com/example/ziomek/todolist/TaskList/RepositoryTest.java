package com.example.ziomek.todolist.TaskList;

import org.junit.Before;
import org.junit.Test;

import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.*;

public class RepositoryTest {

    @Test
    public void addTest() {
        Repository.getInstance().add("x362AF8BRirzJulISUOSJs0zlWdOnRMvQym87uvqN3i3GdYbz1J2a7nTjlwB9kXjolO4prSj1OlnUtlHs2kIbUR9w3t7BNzAXzPMMYhQdQZF66yRgPzo1WUEvGv8N403tw3NuJh6WWZrwUSOcDIXKzXKhY26DPHFeXwx92UTSFMpKW8KJZr1IZUy3HCKbrZvicPNCaYYitmrOsJAmUZaFFMZP9t3VaT7xyiHF0XmS2IebI3wiBgcXXOFKBsPqY2UFWnVNLW7y5U9qTFIFeFLfDzvENM0sRQ65nbSgZ6TleOkrCilme2SK3NncGKKJnJrZAt4htZRQRRFVWanYgWNCmSOAkHUcRJTJeqaIIY7DZujrRrkjSmcBNadUOkm44LohrhTcL4Kvd7SmgKYdfzVhZ5vVgTQ8pHt12sa4bjGEKckZKbCWeUswjI6RWR8SwhrP9KZppjZvG6wtwTz3tf0VIEkO6LL2DgMDzNo287XS9YCcbJDNHBXlR9L40T5lHtdjJmSYB3SjdEfs8p8YsIc6LxqvNzlXf8DTjnRWS2of8aox2Z2qJZGnJZJB7wZbBgqjSC5LpnckcDo6aKJE59VZdmd3W7SVxGIgoojdMVeJUi5FnsINekrRJvJmUXUj8j9cKXwb1EdeaOPC7Wh1SSScMYX8lcAMEvePxzuVlhMWLw7MaSYZeEkkbJspbZCn3wv8LHeqTiHm3nKTECfEYd93WPNvZDmed4pWiwz5VTDe0uA4WWQHtMESZvf8GuDMh46YWfiU3WzHASczWv4EhGmAoa2fRWFMs5ekSzssR0hJUUEKTrL4TBk30Vacjt8UYxvhi4OjYbKNln8cet8n4HXvURBHCimyr7sBda8ROR1UYlVOk0u7tX3dlgPfcUY5Y05OZH9WIbjdYmnXzYV1ySbneTnWLctQWgMUrxDOrjTS9Y2VS4220jIgMvq1iZFzXiydJcorfcnI57HYYWSOsxPprRQPreF3VnntIeMRshS\n");
        assertEquals(Repository.getInstance().getSize(),0);
    }

    @Test
    public void addTest2() {
        Repository.getInstance().add("Abda");
        assertNotNull(Repository.getInstance().getTasks().get(0));
        Repository.getInstance().remove("Abda");
    }

    @Test
    public void getAll() {
        Repository.getInstance().add("Adda");
        Repository.getInstance().add("Adda");
        Repository.getInstance().add("Adda");

        Task task1 = new Task();
        task1.setContent("Adda");
        Task task2 = new Task();
        task2.setContent("Adba");


        List<Task> tasks = new ArrayList<>();
        tasks.add(task1);
        tasks.add(task2);
        tasks.add(task1);

        assertNotEquals(Repository.getInstance().getAll(),tasks);
        for(int i=0;i<3;i++){
            Repository.getInstance().remove("Adda");
        }
    }

    @Test
    public void remove() {
        Repository.getInstance().add("Adda");
        Repository.getInstance().add("Abda");
        Repository.getInstance().remove("Adda");

        ArrayList<String> tasks = new ArrayList<>();
        tasks.add("Abda");
        assertEquals(Repository.getInstance().getTasks(),tasks);
    }
}