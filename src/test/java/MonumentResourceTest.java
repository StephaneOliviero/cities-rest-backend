import org.junit.Assert;
import org.junit.Test;
import org.mockito.Mockito;

import co.simplon.PoleEmploi.patrimoine.dao.MonumentDao;
import co.simplon.PoleEmploi.patrimoine.dao.MonumentMockDao;
import co.simplon.PoleEmploi.patrimoine.endpoint.MonumentResource;

public class MonumentResourceTest {

	@Test(expected = IllegalArgumentException.class)
	public void deleteMonumentById_should_throw_IllegalArgumentException_when_id_is_null() {

		// GIVEN
		Long id = null;
		MonumentResource resource = new MonumentResource();

		// WHEN
		resource.deleteMonumentById(id);

		// THEN : cf annotation

	}

	@Test
	public void getMonuments_should_return_DEFAULT_PAGE_SIZE_items_when_from_and_limit_are_both_null(){
		
		// GIVEN
		
		MonumentResource resource = new MonumentResource();
		MonumentMockDao dao = new MonumentMockDao();
		resource.setMonumentDao(dao);
		
		// WHEN
		int taille = resource.getMonuments(null,null).size();

		// THEN 
		Assert.assertEquals(10, taille);
	}
	
	@Test
	public void with_Mockito_getMonuments_should_return_DEFAULT_PAGE_SIZE_items_when_from_and_limit_are_both_null(){
		
		// GIVEN
		
		MonumentResource resource = new MonumentResource();
		MonumentMockDao dao = Mockito.mock(classToMock) new MonumentMockDao();
		resource.setMonumentDao(dao);
		
		// WHEN
		int taille = resource.getMonuments(null,null).size();

		// THEN 
		Assert.assertEquals(10, taille);
	}
}