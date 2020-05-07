.PHONY: all

all: build

build:
	@./gradlew build --warning-mode all

run-tests:
	@./gradlew test --warning-mode all

run:
	@./gradlew :run


