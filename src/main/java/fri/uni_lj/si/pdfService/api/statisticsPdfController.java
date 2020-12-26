package fri.uni_lj.si.pdfService.api;

import com.lowagie.text.Document;
import com.lowagie.text.PageSize;
import com.lowagie.text.Paragraph;
import com.lowagie.text.pdf.PdfWriter;
import fri.uni_lj.si.pdfService.models.Statistic;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@RestController
@RequestMapping("api/v1")
public class statisticsPdfController {

    @GetMapping("/hello")
    public String helloWorld() {

        return "Hello world!";
    }

    @PostMapping("/pdfStatistic")
    public void helloWorld(@RequestBody Statistic stat, HttpServletResponse response) throws IOException {
        response.setContentType("application/pdf");
        String headerKey = "Content-Disposition";
        String headerValue = "attachment; filename=users.pdf";

        response.setHeader(headerKey, headerValue);

        Document doc = new Document(PageSize.A4);
        PdfWriter.getInstance(doc, response.getOutputStream());

        doc.open();

        doc.add(new Paragraph("id: " + stat.getId()));
        doc.add(new Paragraph("User id: " + stat.getUserId()));
        doc.add(new Paragraph("Number of completed: " + stat.getNumOfCompleted()));
        doc.add(new Paragraph("Number of in progress: " + stat.getNumOfInProgress()));
        doc.add(new Paragraph("Number of to do: " + stat.getNumOfToDo()));
        doc.add(new Paragraph("Timestamp: " + stat.getNumOfToDo()));

        doc.close();

    }


}
