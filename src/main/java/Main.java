
import com.controller.Controller;
import com.service.Service;
import com.util.Reader;
import com.view.ReaderView;
import com.view.RecordView;

public class Main {

	public static void main(String[] args) {

		RecordView view = new RecordView();
		ReaderView readerView = new ReaderView();
		Reader reader = new Reader(readerView);
		Service service = new Service();
		Controller controller = new Controller(reader, view, service);
		controller.doProcess();

	}

}
