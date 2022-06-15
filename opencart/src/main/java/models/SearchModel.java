package models;

public class SearchModel {

    SearchModel() {
    }

    public static SearchModel.Builder getBuilder() {
        return new SearchModel().new Builder();
    }

    private class Builder {
        public SearchModel.Builder inputSearch(String value) {
            return this;
        }

        public SearchModel build() {
            return SearchModel.this;
        }
    }
}