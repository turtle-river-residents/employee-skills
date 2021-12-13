package employee_skills.api.persistence.database;

import com.github.springtestdbunit.dataset.AbstractDataSetLoader;
import org.dbunit.dataset.IDataSet;
import org.dbunit.dataset.ReplacementDataSet;
import org.dbunit.dataset.csv.CsvURLDataSet;
import org.springframework.core.io.Resource;

public class CsvDataSetLoader extends AbstractDataSetLoader {
    @Override
    protected IDataSet createDataSet(Resource resource) throws Exception {
        CsvURLDataSet csvUrlDataSet = new CsvURLDataSet(resource.getURL());

        ReplacementDataSet replacementDataSet = new ReplacementDataSet(csvUrlDataSet);
        replacementDataSet.addReplacementObject("[null]", null);
        return replacementDataSet;
    }
}
